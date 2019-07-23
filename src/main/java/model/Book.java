package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

    private Long id;
    private String name;
    private Double value;
    private String author;

    public Book() {
    }

    public Book(Long id, String name, Double value, String author) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", author='" + author + '\'' +
                '}';
    }
}
