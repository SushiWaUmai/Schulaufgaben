package Welt;

public class Welt{

	public class Kontinent{
		String name;
		int flache;
		int einwohner;

		public Kontinent(String _name, int _flache, int _einwohner){
			name = _name;
			flache = _flache;
			einwohner = _einwohner;
		}

		public boolean groesser(Kontinent _vergleich){
			return flache > _vergleich.flache;
		}

		public boolean einwohnerGroesser(Kontinent _vergleich){
			return einwohner > _vergleich.einwohner;
		}

		public String toString(){
			return name;
		}		
	}

	long gesamtflache;
	long einwohner;
	Kontinent[] kontinente;

	public Welt(){
		kontinente = new Kontinent[6];
		kontinente[0] = new Kontinent("Nordamerika", 24900, 523000);
		kontinente[1] = new Kontinent("Europa", 10500, 733000);
		kontinente[2] = new Kontinent("Asien", 44400, 4010000);
		kontinente[3] = new Kontinent("Australien", 8500, 34000);
		kontinente[4] = new Kontinent("Afrika", 30300, 944000);
		kontinente[5] = new Kontinent("Suedamerika", 17800, 381000);
	}

	public void bubbleSort() {
		for (int i = 0; i < kontinente.length; i++) {
			for (int j = i; j < kontinente.length; j++) {
				// swap kontinente[i] with kontinente[j]
				if(kontinente[i].einwohnerGroesser(kontinente[j])){
					Kontinent temp = kontinente[i];
					kontinente[i] = kontinente[j];
					kontinente[j] = temp;
				}
			}
		}
	}

	public String toString(){
		String result = "";

		for (int i = 0; i < kontinente.length; i++){
			result += kontinente[i].toString() + (i != kontinente.length - 1 ? ", " : ""); 
		}

		return result;
	}
}