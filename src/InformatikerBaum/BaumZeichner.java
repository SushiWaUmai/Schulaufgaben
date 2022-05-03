 

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

 /**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 *
 * @Version 2014-03-13
 */
public class BaumZeichner<TYP> extends Frame {

	private BinaryTree<TYP> _baum;
	private BufferedImage img;
	private Graphics g;
	private int _dy; // Abstand der Baumebenen
	private String suchName = "";

	public BaumZeichner(int frameWidth, int frameHeight, BinaryTree<TYP> pBaum) {
		super("BinaryTree");
		_baum = pBaum;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				dispose();
			}
		});

		addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				zeigeBaum();
			}
		});

		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);

		setResizable(true);
		setVisible(true);

	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, 0, 25, this);
	}

	public void zeigeBaum() {
		if (_baum == null)
			return;

		Dimension x = getSize();
		img = new BufferedImage(x.width, x.height - 25,
				BufferedImage.TYPE_INT_RGB);
		g = img.getGraphics();
		g.setColor(new Color(200, 200, 200));
		loesche(g, x.width, x.height);
		_dy = (x.height - 25) / (tiefe(_baum) + 1);
		zeichneInorder(0, x.width, 50, _baum);
		this.repaint();
	}

	public void zeigeBaum(BinaryTree<TYP> pBaum) {
		_baum = pBaum;
		zeigeBaum();
	}

	public void loesche(Graphics g, int x, int y) {
		g.setColor(new Color(220, 220, 230));
		g.fillRect(0, 0, x, y);
		g.setColor(new Color(0, 0, 250));
		g.setFont(new Font("Arial", Font.BOLD, 12));
	}

	private void zeichneInorder(int links, int rechts, int y,
			BinaryTree<TYP> baum) {
		if (baum.isEmpty())
			return;
		int mitte = (links + rechts) / 2;
		zeichneInorder(links, mitte, y + _dy, baum.getLeftTree());
		zeigeKnoten(links, rechts, y, baum.getContent().toString());
		zeichneInorder(mitte, rechts, y + _dy, baum.getRightTree());
	}

	private void zeigeKnoten(int links, int rechts, int y, String inhalt) {
		String hilf = inhalt;
		int mitte = (links + rechts) / 2;
		double abstand = Math.sqrt((mitte - links) * (mitte - links) + _dy
				* _dy);
		int ddx = (int) ((mitte - links) / abstand * 10);
		int ddy = (int) (_dy / abstand * 10);
		g.setColor(new Color(0, 0, 0));
		g.drawLine(mitte - ddx, y + ddy, (links + mitte) / 2 + ddx, y + _dy
				- ddy);
		g.drawLine(mitte + ddx, y + ddy, (mitte + rechts) / 2 - ddx, y + _dy
				- ddy);

		int io = inhalt.indexOf(' ');
		if (io >= 0) {
			hilf = inhalt.substring(0, inhalt.indexOf(' '));
		}
		if (io < 0 || suchName.equals(hilf))
			g.setColor(new Color(255, 200, 200));
		else
			g.setColor(new Color(255, 255, 0));
		g.fillArc(mitte - 10, y - 10, 20, 20, 0, 360);
		g.setColor(new Color(0, 0, 0));
		g.drawArc(mitte - 10, y - 10, 20, 20, 0, 360);
		g.setColor(new Color(250, 0, 50));
		g.drawString(inhalt, mitte - 3, y + 5);
	}

	public int tiefe(BinaryTree<TYP> baum) {
		if (baum.isEmpty())
			return 0;
		int links = tiefe(baum.getLeftTree()) + 1;
		int rechts = tiefe(baum.getRightTree()) + 1;
		if (links > rechts)
			return links;
		else
			return rechts;
	}

	public void warte(int dur) {
		try {
			Thread.sleep(dur);
		} catch (Exception e) {
		} finally {
		}
	}

	public void markiere(String name) {
		suchName = name;
	}

}
