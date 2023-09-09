package com.dave.techtest.model;

public class Team implements Comparable<Team> {

    private String id;
    private String name;
    private SPORT sport;
    private String league;

    public Team() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((league == null) ? 0 : league.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sport == null) ? 0 : sport.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Team other = (Team) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (league == null) {
            if (other.league != null)
                return false;
        } else if (!league.equals(other.league))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sport != other.sport)
            return false;
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SPORT getSport() {
        return sport;
    }

    public void setSport(SPORT sport) {
        this.sport = sport;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "Team [name=" + name + ", sport=" + sport + ", league=" + league + "]";
    }

    @Override
    public int compareTo(Team o) {
        return id.compareTo(o.getId());
    }
}
