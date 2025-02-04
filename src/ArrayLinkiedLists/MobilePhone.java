package ArrayLinkiedLists;

import java.util.ArrayList;

public class MobilePhone {
    private String name;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String name) {
        this.name=name;
        this.myContacts= new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int position = findContact(oldContact);
        if(position<0) {
            System.out.println(oldContact.getName()+" was not found");
            return false;
        }else if(findContact(newContact.getName())!=1){
            System.out.println("Contact with name "+newContact.getName()+
                    " already exists. Update was not successful.");
            return false;
        }
        this.myContacts.set(position,newContact);
        System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
        return true;
    }
    public boolean removeContact(Contacts contacts){
        int position = findContact(contacts);
        if(position<0) {
            System.out.println(contacts.getName()+" was not found");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contacts.getName()+" was removed with ");
        return true;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i <this.myContacts.size(); i++) {
            Contacts contact=this.myContacts.get(i);
            if(contact.getName().equals(contactName))
                return i;
        }
        return -1;
    }

    public String queryContact(Contacts contacts){
        if(findContact(contacts)>=0)
            return contacts.getName();
        return null;
    }
    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position>=0)
            return this.myContacts.get(position);
        return null;
    }
    public void printContacts() {
        System.out.println("Contact list");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1)+"."+
                    this.myContacts.get(i).getName() + " -> "+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
