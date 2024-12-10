package com.example.SPARK.ONLINEBOOK.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "books")
public class BookModel {
    @Id
    private String id;
    private String title;
    private String author;
    private Integer price;
    private String description;
    private String genre;
    private Date publishedDate;
    private String stock;

    public BookModel(String id, String title, String author, Integer price, String description, String genre, Date publishedDate, String stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "bookmodel{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                ", publishedDate=" + publishedDate +
                ", stock='" + stock + '\'' +
                '}';
    }
}
