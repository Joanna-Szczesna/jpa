package pl.joannaszczesna.jpa.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "GRADE")
class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "VALUE_PERCENTAGE")
    private int value;
    @Column(name = "USER_ID")
    private long userId;
    @Column(name = "COURSE_ID")
    private long courseId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }
}
