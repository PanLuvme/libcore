import java.util.*;

public class LibCoreInventoryManagement {
	private List<Resource> resourceList = new ArrayList<Resource>();

	public void addResource(String title, String author, String category) {
		for (int i = 0; i < resourceList.size(); i++) {
			Resource addedResource = new Resource(title, author, category);
			resourceList.add(addedResource);
		}
	}
	
	public void editResource(String resourceTitle, String ) {
		for (int i = 0; i < resourceList.size(); i++) {
			Resource inlist = resourceList.getTitle(resourceTitle);
			if (inlist.equalsIgnoreCase(resource)) {
				resourceList.set
			}
		}
	}
	
	public void removeResource(Resource resource) {
		String stringAsResource = String.valueOf(resource);
		boolean removed = resourceList.remove(resource);
		if (removed == true) {
			return;
		}
		else {
			System.out.println("Not Removed");
		}
	}
}
