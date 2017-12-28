package com.redhat.demo.book;



import javax.persistence.*;

@Entity
public class Book{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
	@SequenceGenerator(name = "book_seq", sequenceName = "book_seq", allocationSize = 1, initialValue = 1)
	private int id;
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    private String title;
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    private String description;
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public Book() {
    }

}
