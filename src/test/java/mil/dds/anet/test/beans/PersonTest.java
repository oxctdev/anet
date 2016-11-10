package mil.dds.anet.test.beans;

import org.junit.Test;

import mil.dds.anet.beans.Person;
import mil.dds.anet.beans.Person.Role;
import mil.dds.anet.beans.Person.Status;
import mil.dds.anet.beans.ReportPerson;

public class PersonTest extends BeanTester<Person> {

	public static Person getJackJacksonStub() { 
		final Person person = new Person();
		person.setFirstName("Jack");
		person.setLastName("Jackson");
		person.setEmailAddress("foobar@example.com");
		person.setPhoneNumber("123-456-78960");
		person.setRank("OF-9");
		person.setStatus(Status.ACTIVE);
		person.setRole(Role.ADVISOR);
		person.setBiography("this is a sample biography");
		return person;
	}

	public static Person getSteveStevesonStub() {
		Person person = new Person();
		person.setFirstName("Steve");
		person.setLastName("Steveson");
		person.setEmailAddress("steve@example.com");
		person.setPhoneNumber("+011-258-32895");
		person.setRank("LtCol");
		person.setStatus(Status.ACTIVE);
		person.setRole(Role.PRINCIPAL);
		person.setBiography("this is a sample person who could be a Principal!");
		return person;
	}
	
	@Test
	public void serializesToJSON() throws Exception {
		serializesToJSON(getJackJacksonStub(), "testJson/people/jack.json");
	}
	
	@Test
    public void deserializesFromJSON() throws Exception {
		deserializesFromJSON(getJackJacksonStub(), "testJson/people/jack.json");
    }

	public static Person getRogerRogwell() {
		Person person = new Person();
		person.setFirstName("Roger");
		person.setLastName("Rogwell");
		person.setEmailAddress("roger@example.com");
		person.setPhoneNumber("+1-412-543-2839");
		person.setRank("Maj");
		person.setStatus(Status.ACTIVE);
		person.setRole(Role.PRINCIPAL);
		person.setBiography("roger is another test person that we have in the database. ");
		return person;
	}

	public static Person getElizabethElizawell() {
		Person person = new Person();
		person.setFirstName("Elizabeth");
		person.setLastName("Elizawell");
		person.setEmailAddress("liz@example.com");
		person.setPhoneNumber("+1-777-7777");
		person.setRank("Capt");
		person.setStatus(Status.ACTIVE);
		person.setRole(Role.ADVISOR);
		person.setBiography("elizabeth is another test person we have in the database");
		return person;
	}

	public static ReportPerson personToReportPerson(Person p) {
		ReportPerson rp = new ReportPerson();
		rp.setFirstName(p.getFirstName());
		rp.setLastName(p.getLastName());
		rp.setId(p.getId());
		rp.setPhoneNumber(p.getPhoneNumber());
		rp.setEmailAddress(p.getEmailAddress());
		rp.setBiography(p.getBiography());
		rp.setLoadLevel(p.getLoadLevel());
		rp.setCreatedAt(p.getCreatedAt());
		rp.setUpdatedAt(p.getUpdatedAt());
		rp.setRank(p.getRank());
		rp.setRole(p.getRole());
		rp.setPendingVerification(p.getPendingVerification());
		rp.setStatus(p.getStatus());
		return rp;
	}

	
	

}