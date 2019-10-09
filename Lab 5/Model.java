public class Model {
	protected int uniqueID; //for all class. All id is unique anyway so just use this one
	
	public Model(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	//We don't have the setter as id should be read-only
	public int getUniqueID() {
		return uniqueID;
	}
}