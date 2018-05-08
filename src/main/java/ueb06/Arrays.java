package ueb06;

class Arrays {
	/**
	 * Gibt eine Stringrepraesentation des Arrays zurueck, z.B. [] oder [1, 2, 3]
	 */
	static <T> String toString(T[] array) {

        if (array.length == 0)
            return "[]";
        else
            return "[" + toString(array, 0) + "]";

	}

    private static <T> String toString(T[] array, int i) {
        if (i == array.length - 1)
            return array[i].toString(); // wenn das letzte E ist , fürt obere Methode
        else
            return array[i].toString() + ", " + toString(array, i + 1); //ruf sich selbe mit den nächsten E
    }

    /**
	 * Gib zurück, ob ein Objekt in dem Array enthalten ist; verwendet `equals`
	 */
	static <T> boolean contains(T[] array, T object) {
	    if(array.length==0)
		return false;
	    else{
	        return contains(array,object,0);

        }

	}
	private static <T> boolean contains (T[] array,T obj, int i){
	    if(i==array.length)// sind wir bei allen durchgelaufen?
	        return false;

	    else if(array[i].equals(obj)){ // sind an die richtige Stelle(verglechen array stelle mit Obj), ob Obj drin ist
	        return true;
        }
        else {
	        return contains(array,obj,i++); // leuft bis Obj findet, oder wenn wir weit gekommen sind
        }
    }
}
