package uchidb;

import java.util.*;

/**
 * @author aelmore
 */

public class HW0Runner {

	//TODO you likely will need to add member variable
    private static Conts c = null;

    private HW0Runner() {

    }
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
        if (c == null)
            c = new Conts();
		return c;
	}


	public static void main(String[] args){
	}
}