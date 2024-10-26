package com.example.springWithoutDB.Book;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path="book")
public class BookController {

    List<book> books=new ArrayList<>();

    @GetMapping()
    public String test(){
        return "book is working....";
    }


    @GetMapping("/all")
    public List<book> getBooks() {
        return books;
    }

    @PostMapping("/add")
    public List<book> addBook(@RequestBody book bookData){
        book newbook=new book(bookData.name,bookData.author,bookData.quantity,bookData.releaseDate);
        books.add(newbook);
        return books;
    }

    @GetMapping("/info/{id}")
    public book getBook(@PathVariable Long id){
        for(book b:books){
            if(b.id==id){
                return b;
            }
        }
        return new book();
    }

    @PutMapping("/update/{id}")
    public book updateBook(@RequestBody book BookData,@PathVariable Long id){
        int j=0;
        for(int i=0;i<books.size();i++){
            if(books.get(i).id==id){
                j=i;
                book updateData=BookData;
                updateData.id=id;
                books.set(i,updateData);
            }
        }
        return books.get(j);
    }

    @DeleteMapping("/delete/{id}")
    public String DeleteData(@PathVariable Long id){
        for(int i=0;i<books.size();i++){
            if(Objects.equals(books.get(i).id,id)){
                books.remove(i);
                return "Deleted successfully";
            }
        }
        return "sorry,id is incorrect...";
    }
}
