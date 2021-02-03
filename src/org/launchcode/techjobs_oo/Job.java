package org.launchcode.techjobs_oo;



public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();

        this.setName(name);
        this.setEmployer(employer);
        this.setLocation(location);
        this.setPositionType(positionType);
        this.setCoreCompetency(coreCompetency);

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {



        String id = "ID: " + getId() + '\n';
        String nam = "Name: " + ((getName().isBlank()) ? "Data not available" : getName()) + '\n';
        String emp = "Employer: " + ((getEmployer().toString().isBlank()) ? "Data not available" : getEmployer()) + '\n';
        String loc = "Location: " + ((getLocation().toString().isBlank()) ? "Data not available" : getLocation()) + '\n';
        String pos = "Position Type: " + ((getPositionType().toString().isBlank()) ? "Data not available" : getPositionType()) + '\n';
        String com = "Core Competency: " + ((getCoreCompetency().toString().isBlank()) ? "Data not available" : getCoreCompetency()) + '\n';

        return '\n' + id + nam + emp + loc + pos + com;


    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (id != job.id) return false;
        if (!name.equals(job.name)) return false;
        if (!employer.equals(job.employer)) return false;
        if (!location.equals(job.location)) return false;
        if (!positionType.equals(job.positionType)) return false;

        return coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {

        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + employer.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + positionType.hashCode();
        result = 31 * result + coreCompetency.hashCode();

        return result;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
