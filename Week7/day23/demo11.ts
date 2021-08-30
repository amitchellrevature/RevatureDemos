class Book{
    public title: string;
    public author: string;
    public price: number;

    constructor(title: string, author: string, price: number){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public getBookInfo(){
        console.log(`Book: Title=${this.title}, Author=${this.author}, Price=${this.price}`)
    }

}

let book1 = new Book('Title 1', 'Author 1', 1000);
let book2 = new Book('Title 2', 'Author 2', 2000);

book1.getBookInfo();
book2.getBookInfo();

// console.log('Book: Title='+ book1.title + ', Author='+ book1.author+ ', Price='+ book1.price);
// console.log('Book: Title='+ book2.title + ', Author='+ book2.author+ ', Price='+ book2.price);