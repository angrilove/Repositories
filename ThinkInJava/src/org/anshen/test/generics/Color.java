package org.anshen.test.generics;

public class Color<T> {

}

class RGB {
	
}

class Colored<T extends RGB> extends Color<T> {
	
}

class Dimension {
	public int x, y, z;
}

interface HasColor {
	boolean hasColor();
}

class ColoredDimension<T extends Dimension & HasColor> {
	
}
