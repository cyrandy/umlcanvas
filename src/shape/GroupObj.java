package shape;

import java.util.ArrayList;

import umlEditorGui.UMLCanvas;

public class GroupObj extends UMLObject {
	UMLCanvas canvas = UMLCanvas.getInstance();
	ArrayList<UMLObject> ObjectList = new ArrayList<UMLObject>();
	
	public GroupObj(ArrayList<UMLObject> objList) {
		ObjectList = objList;
	}
	
	@Override
	public void setPosX(int x) {
		for (UMLObject obj : ObjectList ) {
			obj.setPosX(obj.getPosX()+x);
		}
	}
	
	@Override
	public void setPosY(int y) {
		for (UMLObject obj : ObjectList ) {
			obj.setPosY(obj.getPosY()+y);
		}
	}
	
	@Override
	public boolean isInObjRange(int x, int y) {
		for (UMLObject object : ObjectList ) {
			if (object.isInObjRange(x, y))	return true;
		}
		return false;
	}

	@Override
	public boolean isInObjRange(int x1, int y1, int x2, int y2) {
		for (UMLObject object : ObjectList) {
			if (object.isInObjRange(x1, y1, x2, y2)) return true;
		}
		return false;
	}
	
	@Override
	public void setSelectMode(boolean m) {
		for (UMLObject obj : ObjectList) {
			obj.setSelectMode(m);
		}
	}

	@Override
	public boolean isSelected() {
		for (UMLObject object : ObjectList) {
			if (object.isSelected()) return true;
		}
		return false;
	}

	public ArrayList<UMLObject> getObjectList() {
		return ObjectList;
	}
	
	@Override
	public void unGroup(){
		canvas.unGroup(this);
	}

}
