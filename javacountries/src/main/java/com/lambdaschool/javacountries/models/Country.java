// Explanation:

package com.lambdaschool.javacountries.models;

import javax.persistence.*;

// What is this?
@Entity

// What is this?
@Table(name = "countries")

public class Country
{
    // What is this?
    @Id
    // What is this?
    @GeneratedValue(strategy = GenerationType.AUTO)

    // These are my table fields
    private long countryid;
    private String name;
    private long population;
    private long landmasskm2;
    private int medianage;

    // This is my default constructor - required for Spring Data JPA
    public Country()
    {
        // Default Constructor
    }

    // Personally made constructor with parameters
    public Country(
        String name,
        long population,
        long landmasskm2,
        int medianage)
    {
        this.name = name;
        this.population = population;
        this.landmasskm2 = landmasskm2;
        this.medianage = medianage;
    }

    // These are my Getter and Setter methods for the above fields
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getPopulation()
    {
        return population;
    }

    public void setPopulation(long population)
    {
        this.population = population;
    }

    public long getLandmasskm2()
    {
        return landmasskm2;
    }

    public void setLandmasskm2(long landmasskm2)
    {
        this.landmasskm2 = landmasskm2;
    }

    public int getMedianage()
    {
        return medianage;
    }

    public void setMedianage(int medianage)
    {
        this.medianage = medianage;
    }

    // What is this?
    @Override
    public String toString()
    {
        return "Country{" +
            "name=" + name +
            "population=" + population +
            "landmasskm2=" + landmasskm2 +
            "medianage=" + medianage +
            '}';
    }
}
