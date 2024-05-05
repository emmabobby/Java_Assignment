import java.util.Arraylist;


public class mobilePhone{
	private String myNumber;
	private Arraylist<contact>() myContacts;

public  MobilePhone(String myNumber) {
	this.myNumber = myNumber;
	this.myContact = newArrayList<contact>();

}
public boolean addNewContact(Contact contact, contact newContact) {
	if(findContact(conntact.getName()) >=0) {
		System.out.println("contact is alredy on file");
		return false;

}

myContacts.add(contact);
return true;

}

public boolean( Contact oldContact), Contact newContact) {
	int foundPosition = findContact(oldContact);
if(foundPosition<0 { 
	System.out.println(oldContacty.getName() + ", was not found.");
	return false

}

this.myContacts.remove(foundPosition);
System.out.println(contact.getName() + ", was deleted. ");
return true;

}
this.myContact.set(foundPOsition, newContact);
System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName();
return true;
}

private int findContact(Contact contact) {
	return this.myContacts.indexOf(contact);
}

privte int findContact(String contactNmae) {
	for(int i=0; i<thos.myContacts.size(); i++) {
		Contact contact = this.myContact.get(i);
		if(contact.getNmae()equal is (contactName)) {
			return i;
}
}
	return -1

}
