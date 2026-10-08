package es.uniovi.eii.ds.editor.core;

import java.io.PrintWriter;

public class Editor {

	private Drawing drawing;
	private PrintWriter out;
	
	public Editor(PrintWriter out) {
		this.out = out;
		this.drawing = new Drawing();
	}
	
	// * Drawing methods

	public void draw() {
		drawing.draw(out);
	}
	
	public Drawing drawing() {
		return drawing;
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
