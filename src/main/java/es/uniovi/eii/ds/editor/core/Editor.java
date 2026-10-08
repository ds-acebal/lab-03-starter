package es.uniovi.eii.ds.editor.core;

public class Editor {

	private Drawing drawing;
	
	public Editor() {
		this(new Drawing());
	}
	
	public Editor(Drawing drawing) {
		setDrawing(drawing);
	}

	public void draw() {
		drawing.draw();
	}
	
	// * Drawing methods
	
	public Drawing drawing() {
		return drawing;
	}
		
	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}
		
    // * UI methods

	public void toolButtonPressed(String toolName) {
		// ...
	}

	public void mousePressed(int x, int y) {
		// ...
	}

	public void mouseMoved(int x, int y) {
		// ...
	}

	public void mouseReleased(int x, int y) {
		// ...
	}
}
