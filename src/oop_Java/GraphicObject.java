package oop_Java;

abstract class GraphicObject {
	int x, y;
	
	void moveTo(int newX, int newY) {
	}
	abstract void draw();
	abstract void resize();
	
}
