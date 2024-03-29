package PlanetenSzenario;

import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 14 * 10 Feldern.
 */

public class Planet extends World
{
    public static Planet instance;
    private static int zellenGroesse = 50;
    public boolean[][] grid;
    public static final int WIDTH = 16;
    public static final int HEIGHT = 12;

    /**
     * Erschaffe eine Welt mit 15 * 12 Zellen.
     */
    public Planet()
    {
        super(WIDTH, HEIGHT, zellenGroesse);
        setBackground("images/boden.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20); 
        instance = this;

        initNodes();
    }

    public void initNodes()
    {
        Node.allNodes = new Node[WIDTH][HEIGHT];

        for (int x = 0; x < WIDTH; x++)
        {
            for (int y = 0; y < HEIGHT; y++)
            {
                boolean traversable = getObjectsAt(x, y, Huegel.class).size() == 0;
                Node.allNodes[x][y] = new Node(x, y, traversable);
            }
        }
    }

    public void aStar()
    {
        Huegel actor29 = new Huegel();
        addObject(actor29, 1, 9);
        Huegel actor30 = new Huegel();
        addObject(actor30, 2, 9);
        Huegel actor31 = new Huegel();
        addObject(actor31, 4, 9);
        Huegel actor32 = new Huegel();
        addObject(actor32, 14, 9);
        Huegel actor33 = new Huegel();
        addObject(actor33, 13, 9);
        Huegel actor34 = new Huegel();
        addObject(actor34, 9, 8);
        Huegel actor35 = new Huegel();
        addObject(actor35, 8, 8);
        Huegel actor36 = new Huegel();
        addObject(actor36, 3, 7);
        Huegel actor37 = new Huegel();
        addObject(actor37, 4, 7);
        Huegel actor38 = new Huegel();
        addObject(actor38, 5, 7);
        Huegel actor39 = new Huegel();
        addObject(actor39, 6, 7);
        Huegel actor40 = new Huegel();
        addObject(actor40, 2, 7);
        Huegel actor41 = new Huegel();
        addObject(actor41, 1, 7);
        Huegel actor42 = new Huegel();
        addObject(actor42, 12, 7);
        Huegel actor43 = new Huegel();
        addObject(actor43, 13, 7);
        Huegel actor44 = new Huegel();
        addObject(actor44, 10, 6);
        Huegel actor45 = new Huegel();
        addObject(actor45, 9, 6);
        Huegel actor46 = new Huegel();
        addObject(actor46, 5, 5);
        Huegel actor47 = new Huegel();
        addObject(actor47, 4, 5);
        Huegel actor48 = new Huegel();
        addObject(actor48, 3, 5);
        Huegel actor49 = new Huegel();
        addObject(actor49, 7, 5);
        Huegel actor50 = new Huegel();
        addObject(actor50, 12, 5);
        Huegel actor51 = new Huegel();
        addObject(actor51, 14, 5);
        Huegel actor52 = new Huegel();
        addObject(actor52, 13, 5);
        Huegel actor53 = new Huegel();
        addObject(actor53, 13, 3);
        Huegel actor54 = new Huegel();
        addObject(actor54, 10, 4);
        Huegel actor55 = new Huegel();
        addObject(actor55, 1, 4);
        Huegel actor56 = new Huegel();
        addObject(actor56, 3, 3);
        Huegel actor57 = new Huegel();
        addObject(actor57, 6, 3);
        Huegel actor58 = new Huegel();
        addObject(actor58, 7, 3);
        Huegel actor59 = new Huegel();
        addObject(actor59, 11, 2);
        Huegel actor60 = new Huegel();
        addObject(actor60, 9, 2);
        Huegel actor61 = new Huegel();
        addObject(actor61, 10, 2);
        Huegel actor62 = new Huegel();
        addObject(actor62, 15, 1);
        Huegel actor63 = new Huegel();
        addObject(actor63, 0, 1);
        Huegel actor64 = new Huegel();
        addObject(actor64, 7, 7);
        Huegel actor65 = new Huegel();
        addObject(actor65, 6, 9);
        Huegel actor66 = new Huegel();
        addObject(actor66, 3, 9);
        Huegel actor67 = new Huegel();
        addObject(actor67, 12, 11);
        Huegel actor68 = new Huegel();
        addObject(actor68, 13, 8);
        Huegel actor69 = new Huegel();
        addObject(actor69, 6, 4);
        Huegel actor70 = new Huegel();
        addObject(actor70, 1, 2);
        Huegel actor71 = new Huegel();
        addObject(actor71, 2, 2);
        Huegel actor72 = new Huegel();
        addObject(actor72, 4, 1);
        Huegel actor73 = new Huegel();
        addObject(actor73, 0, 0);
        Huegel actor74 = new Huegel();
        addObject(actor74, 1, 0);
        Huegel actor75 = new Huegel();
        addObject(actor75, 2, 0);
        Huegel actor76 = new Huegel();
        addObject(actor76, 3, 0);
        Huegel actor77 = new Huegel();
        addObject(actor77, 4, 0);
        Huegel actor78 = new Huegel();
        addObject(actor78, 5, 0);
        Huegel actor79 = new Huegel();
        addObject(actor79, 6, 0);
        Huegel actor80 = new Huegel();
        addObject(actor80, 7, 0);
        Huegel actor81 = new Huegel();
        addObject(actor81, 8, 0);
        Huegel actor82 = new Huegel();
        addObject(actor82, 9, 0);
        Huegel actor83 = new Huegel();
        addObject(actor83, 10, 0);
        Huegel actor84 = new Huegel();
        addObject(actor84, 11, 0);
        Huegel actor85 = new Huegel();
        addObject(actor85, 12, 0);
        Huegel actor86 = new Huegel();
        addObject(actor86, 13, 0);
        Huegel actor87 = new Huegel();
        addObject(actor87, 14, 0);
        Huegel actor88 = new Huegel();
        addObject(actor88, 15, 0);
        Huegel actor89 = new Huegel();
        addObject(actor89, 13, 1);
        Huegel actor90 = new Huegel();
        addObject(actor90, 8, 1);
        Huegel actor91 = new Huegel();
        addObject(actor91, 6, 1);
        Huegel actor92 = new Huegel();
        addObject(actor92, 6, 5);
        Huegel actor93 = new Huegel();
        addObject(actor93, 6, 6);
        Huegel actor94 = new Huegel();
        addObject(actor94, 13, 4);
        Huegel actor95 = new Huegel();
        addObject(actor95, 11, 9);
        Huegel actor96 = new Huegel();
        addObject(actor96, 12, 9);
        Huegel actor97 = new Huegel();
        addObject(actor97, 8, 9);
        Huegel actor98 = new Huegel();
        addObject(actor98, 9, 9);
        Gestein actor99 = new Gestein();
        addObject(actor99, 14, 8);
        Gestein actor100 = new Gestein();
        addObject(actor100, 14, 4);
        Gestein actor101 = new Gestein();
        addObject(actor101, 5, 4);
        Gestein actor102 = new Gestein();
        addObject(actor102, 5, 6);
        Gestein actor103 = new Gestein();
        addObject(actor103, 1, 3);
        Gestein actor104 = new Gestein();
        addObject(actor104, 1, 1);
        Gestein actor105 = new Gestein();
        addObject(actor105, 1, 6);
        Gestein actor106 = new Gestein();
        addObject(actor106, 8, 5);
        Gestein actor107 = new Gestein();
        addObject(actor107, 10, 7);
        Gestein actor108 = new Gestein();
        addObject(actor108, 1, 8);
        Gestein actor109 = new Gestein();
        addObject(actor109, 6, 8);
        Gestein actor110 = new Gestein();
        addObject(actor110, 5, 10);
        Gestein actor111 = new Gestein();
        addObject(actor111, 8, 10);
        Gestein actor112 = new Gestein();
        addObject(actor112, 11, 10);
        Gestein actor113 = new Gestein();
        addObject(actor113, 14, 11);
        Gestein actor114 = new Gestein();
        addObject(actor114, 12, 8);
        Gestein actor115 = new Gestein();
        addObject(actor115, 11, 5);
        Gestein actor116 = new Gestein();
        addObject(actor116, 11, 3);
        Gestein actor117 = new Gestein();
        addObject(actor117, 7, 1);
        Gestein actor118 = new Gestein();
        addObject(actor118, 14, 1);
        Gestein actor119 = new Gestein();
        addObject(actor119, 4, 8);
        Gestein actor120 = new Gestein();
        addObject(actor120, 3, 2);
        Gestein actor121 = new Gestein();
        addObject(actor121, 8, 6);
        Gestein actor122 = new Gestein();
        addObject(actor122, 7, 11);
        Gestein actor123 = new Gestein();
        addObject(actor123, 5, 2);
        Gestein actor124 = new Gestein();
        addObject(actor124, 10, 1);
        Gestein actor125 = new Gestein();
        addObject(actor125, 3, 11);
        Gestein actor126 = new Gestein();
        addObject(actor126, 2, 10);
        Rover actor127 = new Rover();
        addObject(actor127, 1, 11);

    }

    public void umfahreHuegelErklaerung()
    {
        Huegel actor4 = new Huegel();
        addObject(actor4, 10, 9);
        Huegel actor5 = new Huegel();
        addObject(actor5, 10, 5);
        Huegel actor6 = new Huegel();
        addObject(actor6, 10, 4);
        Huegel actor7 = new Huegel();
        addObject(actor7, 5, 9);
        Huegel actor8 = new Huegel();
        addObject(actor8, 5, 5);
        Huegel actor9 = new Huegel();
        addObject(actor9, 5, 4);
        Rover actor10 = new Rover();
        addObject(actor10, 9, 5);
        Rover actor11 = new Rover();
        addObject(actor11, 9, 9);
        Rover actor12 = new Rover();
        addObject(actor12, 6, 9);
        actor12.setRotation(180);
        Rover actor13 = new Rover();
        addObject(actor13, 6, 5);
        actor13.setRotation(180);

    }

    public void erklaerung()
    {
        Huegel actor1 = new Huegel();
        addObject(actor1, 0, 2);
        Huegel actor2 = new Huegel();
        addObject(actor2, 0, 3);
        Huegel actor3 = new Huegel();
        addObject(actor3, 0, 4);
        Huegel actor4 = new Huegel();
        addObject(actor4, 0, 5);
        Huegel actor5 = new Huegel();
        addObject(actor5, 0, 6);
        Huegel actor6 = new Huegel();
        addObject(actor6, 0, 7);
        Huegel actor7 = new Huegel();
        addObject(actor7, 0, 8);
        Huegel actor8 = new Huegel();
        addObject(actor8, 0, 9);
        Huegel actor9 = new Huegel();
        addObject(actor9, 0, 10);
        Huegel actor10 = new Huegel();
        addObject(actor10, 0, 11);
        Huegel actor11 = new Huegel();
        addObject(actor11, 15, 11);
        Huegel actor12 = new Huegel();
        addObject(actor12, 15, 10);
        Huegel actor13 = new Huegel();
        addObject(actor13, 15, 9);
        Huegel actor14 = new Huegel();
        addObject(actor14, 15, 8);
        Huegel actor15 = new Huegel();
        addObject(actor15, 15, 6);
        Huegel actor16 = new Huegel();
        addObject(actor16, 15, 7);
        Huegel actor17 = new Huegel();
        addObject(actor17, 15, 5);
        Huegel actor18 = new Huegel();
        addObject(actor18, 15, 4);
        Huegel actor19 = new Huegel();
        addObject(actor19, 15, 3);
        Huegel actor20 = new Huegel();
        addObject(actor20, 15, 2);
        Huegel actor21 = new Huegel();
        addObject(actor21, 5, 2);
        Huegel actor22 = new Huegel();
        addObject(actor22, 8, 3);
        Huegel actor23 = new Huegel();
        addObject(actor23, 3, 4);
        Huegel actor24 = new Huegel();
        addObject(actor24, 11, 5);
        Huegel actor25 = new Huegel();
        addObject(actor25, 6, 6);
        Huegel actor26 = new Huegel();
        addObject(actor26, 10, 7);
        Huegel actor27 = new Huegel();
        addObject(actor27, 4, 8);
        Huegel actor28 = new Huegel();
        addObject(actor28, 8, 9);
        Huegel actor29 = new Huegel();
        addObject(actor29, 5, 10);
        Huegel actor30 = new Huegel();
        addObject(actor30, 12, 11);
        Rover actor31 = new Rover();
        addObject(actor31, 1, 11);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void algorithmGroup5()
    {
        Huegel actor20 = new Huegel();
        addObject(actor20, 15, 0);
        Huegel actor21 = new Huegel();
        addObject(actor21, 13, 1);
        Huegel actor22 = new Huegel();
        addObject(actor22, 8, 1);
        Huegel actor23 = new Huegel();
        addObject(actor23, 6, 1);
        Huegel actor24 = new Huegel();
        addObject(actor24, 6, 5);
        Huegel actor25 = new Huegel();
        addObject(actor25, 6, 6);
        Huegel actor26 = new Huegel();
        addObject(actor26, 13, 4);
        Huegel actor27 = new Huegel();
        addObject(actor27, 11, 9);
        Huegel actor28 = new Huegel();
        addObject(actor28, 12, 9);
        Huegel actor29 = new Huegel();
        addObject(actor29, 8, 9);
        Huegel actor30 = new Huegel();
        addObject(actor30, 9, 9);
        Huegel actor31 = new Huegel();
        addObject(actor31, 15, 2);
        Huegel actor32 = new Huegel();
        addObject(actor32, 15, 3);
        Huegel actor33 = new Huegel();
        addObject(actor33, 15, 4);
        Huegel actor34 = new Huegel();
        addObject(actor34, 15, 5);
        Huegel actor35 = new Huegel();
        addObject(actor35, 15, 6);
        Huegel actor36 = new Huegel();
        addObject(actor36, 15, 7);
        Huegel actor37 = new Huegel();
        addObject(actor37, 15, 8);
        Huegel actor38 = new Huegel();
        addObject(actor38, 15, 9);
        Huegel actor39 = new Huegel();
        addObject(actor39, 15, 10);
        Huegel actor40 = new Huegel();
        addObject(actor40, 15, 11);
        Huegel actor41 = new Huegel();
        addObject(actor41, 0, 11);
        Huegel actor42 = new Huegel();
        addObject(actor42, 0, 10);
        Huegel actor43 = new Huegel();
        addObject(actor43, 0, 9);
        Huegel actor44 = new Huegel();
        addObject(actor44, 0, 8);
        Huegel actor45 = new Huegel();
        addObject(actor45, 0, 7);
        Huegel actor46 = new Huegel();
        addObject(actor46, 0, 6);
        Huegel actor47 = new Huegel();
        addObject(actor47, 0, 5);
        Huegel actor48 = new Huegel();
        addObject(actor48, 0, 4);
        Huegel actor49 = new Huegel();
        addObject(actor49, 0, 3);
        Huegel actor50 = new Huegel();
        addObject(actor50, 0, 2);
        Huegel actor51 = new Huegel();
        addObject(actor51, 5, 5);
        Huegel actor52 = new Huegel();
        addObject(actor52, 4, 5);
        Huegel actor53 = new Huegel();
        addObject(actor53, 3, 5);
        Huegel actor54 = new Huegel();
        addObject(actor54, 3, 6);
        Huegel actor55 = new Huegel();
        addObject(actor55, 2, 6);
        Huegel actor56 = new Huegel();
        addObject(actor56, 2, 8);
        Huegel actor57 = new Huegel();
        addObject(actor57, 4, 7);
        Huegel actor58 = new Huegel();
        addObject(actor58, 5, 11);
        Huegel actor59 = new Huegel();
        addObject(actor59, 8, 8);
        Huegel actor60 = new Huegel();
        addObject(actor60, 13, 6);
        Huegel actor61 = new Huegel();
        addObject(actor61, 10, 10);
        Huegel actor62 = new Huegel();
        addObject(actor62, 10, 11);
        Huegel actor63 = new Huegel();
        addObject(actor63, 5, 8);
        Huegel actor64 = new Huegel();
        addObject(actor64, 8, 11);
        Huegel actor65 = new Huegel();
        addObject(actor65, 11, 6);
        Huegel actor66 = new Huegel();
        addObject(actor66, 9, 7);
        Huegel actor67 = new Huegel();
        addObject(actor67, 12, 7);
        Huegel actor68 = new Huegel();
        addObject(actor68, 12, 6);
        Huegel actor69 = new Huegel();
        addObject(actor69, 14, 10);
        Huegel actor70 = new Huegel();
        addObject(actor70, 1, 7);
        Huegel actor71 = new Huegel();
        addObject(actor71, 0, 1);
        Huegel actor72 = new Huegel();
        addObject(actor72, 8, 3);
        Huegel actor73 = new Huegel();
        addObject(actor73, 3, 3);
        Huegel actor74 = new Huegel();
        addObject(actor74, 10, 2);
        Huegel actor75 = new Huegel();
        addObject(actor75, 8, 2);
        Huegel actor76 = new Huegel();
        addObject(actor76, 9, 2);
        Huegel actor77 = new Huegel();
        addObject(actor77, 9, 4);
        Huegel actor78 = new Huegel();
        addObject(actor78, 12, 2);
        Huegel actor79 = new Huegel();
        addObject(actor79, 15, 1);
        Huegel actor80 = new Huegel();
        addObject(actor80, 14, 3);
        Huegel actor81 = new Huegel();
        addObject(actor81, 12, 10);
        Huegel actor82 = new Huegel();
        addObject(actor82, 6, 2);
        Huegel actor83 = new Huegel();
        addObject(actor83, 2, 11);
        Huegel actor84 = new Huegel();
        addObject(actor84, 3, 9);
        Huegel actor85 = new Huegel();
        addObject(actor85, 6, 9);
        Gestein actor86 = new Gestein();
        addObject(actor86, 2, 1);
        Gestein actor87 = new Gestein();
        addObject(actor87, 5, 3);
        Gestein actor88 = new Gestein();
        addObject(actor88, 2, 5);
        Gestein actor89 = new Gestein();
        addObject(actor89, 4, 8);
        Gestein actor90 = new Gestein();
        addObject(actor90, 8, 6);
        Gestein actor91 = new Gestein();
        addObject(actor91, 9, 1);
        Gestein actor92 = new Gestein();
        addObject(actor92, 7, 1);
        Gestein actor93 = new Gestein();
        addObject(actor93, 14, 9);
        Gestein actor94 = new Gestein();
        addObject(actor94, 12, 11);
        Gestein actor95 = new Gestein();
        addObject(actor95, 7, 11);
        Gestein actor96 = new Gestein();
        addObject(actor96, 1, 8);
        Gestein actor97 = new Gestein();
        addObject(actor97, 12, 4);
        Gestein actor98 = new Gestein();
        addObject(actor98, 11, 3);
        Gestein actor99 = new Gestein();
        addObject(actor99, 14, 1);
        Gestein actor100 = new Gestein();
        addObject(actor100, 1, 3);
        Gestein actor101 = new Gestein();
        addObject(actor101, 13, 8);
        Gestein actor102 = new Gestein();
        addObject(actor102, 14, 5);
        Gestein actor103 = new Gestein();
        addObject(actor103, 8, 4);
        Gestein actor104 = new Gestein();
        addObject(actor104, 1, 11);
        Gestein actor105 = new Gestein();
        addObject(actor105, 2, 7);
        Gestein actor106 = new Gestein();
        addObject(actor106, 5, 6);
        Gestein actor107 = new Gestein();
        addObject(actor107, 9, 11);
        Gestein actor108 = new Gestein();
        addObject(actor108, 11, 7);
        Gestein actor109 = new Gestein();
        addObject(actor109, 10, 5);
        Gestein actor110 = new Gestein();
        addObject(actor110, 7, 7);
        Gestein actor111 = new Gestein();
        addObject(actor111, 5, 9);
        Gestein actor112 = new Gestein();
        addObject(actor112, 5, 1);
        Gestein actor113 = new Gestein();
        addObject(actor113, 14, 11);
        Gestein actor114 = new Gestein();
        addObject(actor114, 14, 7);
        Gestein actor115 = new Gestein();
        addObject(actor115, 4, 10);
        Gestein actor116 = new Gestein();
        addObject(actor116, 4, 11);
        Gestein actor117 = new Gestein();
        addObject(actor117, 1, 9);
        Gestein actor118 = new Gestein();
        addObject(actor118, 10, 8);

    }
}   
