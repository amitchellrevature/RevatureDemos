class Book {
//   title;
//   author;
//   price;

  constructor(title, author, price){
    this.title = title;
    this.author = author;
    this.price = price;
  }


    getBookInfo(){
        console.log('Book: Title='+ this.title+', Author='+this.author+', Price='+ this.price);
    }

}

const book1 = new Book('Title 101', 'Author 101', 1000);

//const book1 = new Book();
// book1.title  ='Title 1';
// book1.author = 'Author 1';
// book1.price = 1000;

//console.log('Book: Title='+ book1.title+', Author='+book1.author+', Price='+ book1.price);

book1.getBookInfo();
