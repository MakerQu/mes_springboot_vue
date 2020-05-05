package com.crud_demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Production {
    @Id
    private Date date;
    private int production;

    @Override
    public String toString() {
        return "Production{" +
                "date=" + date +
                ", production=" + production +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }
}
