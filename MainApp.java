import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Author;
import model.Comic;
import model.Ebook;
import model.Mangaka;
import model.Novelis;
import model.Publisher;
import repository.RepositoryBook;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Book");
            System.out.println("2. Author");
            System.out.println("3. Publisher");
            System.out.println("0. Exit");
            System.out.println("Pilih salah satu: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    bookMenu(in);
                    break;
                case 2:
                    authorMenu(in);
                    break;
                case 3:
                    publisherMenu(in);
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }

    public static void bookMenu(Scanner in){
        int bookchoice;

        do {
            System.out.println("Book Menu Searching");
            System.out.println("1. Cari data book yang memiliki price paling murah");
            System.out.println("2. Cari data book yang memiliki price paling mahal");
            System.out.println("3. Cari data book berdasarkan range price");
            System.out.println("4. Cari comic berdasarkan rating mangaka");
            System.out.println("5. Cari book berdasarkan country publisher");
            System.out.println("6. Cari book berdasarkan country author");
            System.out.println("7. Cari data comic yang memiliki price paling mahal");
            System.out.println("0. Kembali ke main menu");
            bookchoice = in.nextInt();
            switch (bookchoice) {
                case 1:
                    findCheapestBook();
                    break;
                case 2:
                    findExpensiveBook();
                    break;
                case 3:
                    findBookPriceByRange(in);
                    break;
                case 4:
                    findComicByMangakaRating(in);
                    break;
                case 5:
                    findBookByPublisherCountry(in);
                    break;
                case 6:
                    findBookByAuthorCountry(in);
                    break;
                case 7:
                    findExpensiveComic();
                    break;
                default:
                    break;
            }
        } while (bookchoice != 0);
    }

    public static void findCheapestBook(){
        List<Ebook> books = RepositoryBook.getAllBooks();
        Ebook lowestPriceBook = books.get(0);
        for (Ebook book : books) {
            if (book.getPrice() < lowestPriceBook.getPrice()) {
                lowestPriceBook = book;
            }
        }

        System.out.println("Buku dengan price paling murah:");
        System.out.println(lowestPriceBook);
    }

    public static void findExpensiveBook(){
        List<Ebook> books = RepositoryBook.getAllBooks();
        Ebook highestPriceBook = books.get(0);
        for (Ebook book : books) {
            if (book.getPrice() > highestPriceBook.getPrice()){
                highestPriceBook = book;
            }
        }

        System.out.println("Buku dengan price paling mahal:");
        System.out.println(highestPriceBook);
    }

    public static void findBookPriceByRange(Scanner in){
        System.out.println("Masukkan batas harga: ");
        double priceLimit = in.nextInt();
        List<Ebook> books = RepositoryBook.getAllBooks();
        List<Ebook> bookListByPriceRange = new ArrayList<>();
        for (Ebook ebook : books) {
            if (ebook.getPrice() < priceLimit){
                bookListByPriceRange.add(ebook);
            }
        }
        System.out.println("List buku dengan price di bawah " + priceLimit);
        for (Ebook book : bookListByPriceRange) {
            System.out.println(book);
            System.out.println();
        }
    }

    public static void findComicByMangakaRating(Scanner in){
        System.out.println("Masukkan rating mangaka: ");
        in.nextLine();
        String rating = in.nextLine();
        List<Ebook> books = RepositoryBook.getAllBooks();
        for (Ebook ebook : books) {
            if (ebook instanceof Comic){
                Comic comic = (Comic) ebook;
                if (comic.getAuthor().getRating().equalsIgnoreCase(rating)){
                    System.out.println(comic);
                    System.out.println();
                }
            }
        }
    }

    public static void findBookByPublisherCountry(Scanner in){
        System.out.println("Masukkan negara: ");
        in.nextLine();
        String country = in.nextLine();
        List<Ebook> books = RepositoryBook.getAllBooks();
        for (Ebook ebook : books) {
            if (ebook.getPublisher().getCountry().equalsIgnoreCase(country)){
                System.out.println(ebook);
                System.out.println();
            }
        }
    }

    public static void findBookByAuthorCountry(Scanner in){
        System.out.println("Masukkan negara: ");
        in.nextLine();
        String country = in.nextLine();
        List<Ebook> books = RepositoryBook.getAllBooks();
        for (Ebook ebook : books) {
            if (ebook.getAuthor().getCountry().equalsIgnoreCase(country)){
                System.out.println(ebook);
                System.out.println();
            }
        }
    }

    public static void findExpensiveComic(){
        List<Ebook> books = RepositoryBook.getAllBooks();
        Ebook highestPriceBook = books.get(0);
        for (Ebook ebook : books) {
            if (ebook instanceof Comic){
                if (ebook.getPrice() > highestPriceBook.getPrice()){
                    highestPriceBook = ebook;
                }
            }
        }
        System.out.println("Comic dengan price paling mahal");
        System.out.println(highestPriceBook);
    }

    public static void authorMenu(Scanner in){
        int authorChoice;

        do {
            System.out.println("Author Menu Searching");
            System.out.println("1. Cari data semua mangaka");
            System.out.println("2. Cari data semua author");
            System.out.println("3. Cari data semua novelis");
            System.out.println("4. Cari author berdasarkan range umur");
            System.out.println("5. Cari author berdasarkan country");
            System.out.println("0. Kembali ke main menu");
            authorChoice = in.nextInt();

            switch (authorChoice) {
                case 1:
                    findMangaka();
                    break;
                case 2:
                    findAuthor();
                    break;
                case 3:
                    findNovelis();
                    break;
                case 4:
                    findAuthorByAge(in);
                    break;
                case 5:
                    findAuthorByCountry(in);
                    break;
                default:
                    break;
            }
        } while (authorChoice != 0);
    }

    public static void findMangaka(){
        List<Mangaka> mangakaList = RepositoryBook.mangakaList;
        for (Mangaka mangaka : mangakaList) {
            System.out.println(mangaka);
            System.out.println();
        }
    }

    public static void findAuthor(){
        List<Author> authorList = RepositoryBook.authorList;
        for (Author author : authorList) {
            System.out.println(author);
            System.out.println();
        }
    }

    public static void findNovelis(){
        List<Novelis> novelisList = RepositoryBook.novelisList;
        for (Novelis novelis : novelisList) {
            System.out.println(novelis);
            System.out.println();
        }
    }

    public static void findAuthorByAge(Scanner in){
        System.out.println("Masukkan batas bawah umur:");
        in.nextLine();
        int batasBawah = in.nextInt();
        System.out.println("Masukkan batas atas umur:");
        in.nextLine();
        int batasAtas = in.nextInt();

        List<Author> authorList = RepositoryBook.authorList;
        for (Author author : authorList) {
            if (author.getAge() >= batasBawah && author.getAge() <= batasAtas){
                System.out.println(author);
                System.out.println();
            }
        }

        List<Novelis> novelisList = RepositoryBook.novelisList;
        for (Novelis novelis : novelisList) {
            if (novelis.getAge() >= batasBawah && novelis.getAge() <= batasAtas){
                System.out.println(novelis);
                System.out.println();
            }
        }

        List<Mangaka> mangakaList = RepositoryBook.mangakaList;
        for (Mangaka mangaka : mangakaList) {
            if (mangaka.getAge() >= batasBawah && mangaka.getAge() <= batasAtas){
                System.out.println(mangaka);
                System.out.println();
            }
        }        
    }

    public static void findAuthorByCountry(Scanner in){
        System.out.println("Masukkan negara: ");
        in.nextLine();
        String country = in.nextLine();

        List<Author> authorList = RepositoryBook.authorList;
        for (Author author : authorList) {
            if (author.getCountry().equalsIgnoreCase(country)){
                System.out.println(author);
                System.out.println();
            }
        }

        List<Novelis> novelisList = RepositoryBook.novelisList;
        for (Novelis novelis : novelisList) {
            if (novelis.getCountry().equalsIgnoreCase(country)){
                System.out.println(novelis);
                System.out.println();
            }
        }

        List<Mangaka> mangakaList = RepositoryBook.mangakaList;
        for (Mangaka mangaka : mangakaList) {
            if (mangaka.getCountry().equalsIgnoreCase(country)){
                System.out.println(mangaka);
                System.out.println();
            }
        }
    }

    public static void publisherMenu(Scanner in){
        int publisherChoice;

        do {
            System.out.println("Publisher Menu Searching");
            System.out.println("1. Cari publisher dengan production cost paling mahal");
            System.out.println("2. Cari publisher dengan production cost paling murah");
            System.out.println("0. Kembali ke main menu");
            publisherChoice = in.nextInt();

            switch (publisherChoice) {
                case 1:
                    findExpensiveProductionCost();
                    break;
                case 2:
                    findCheapestProductionCost();
                    break;
                default:
                    break;
            }
        } while (publisherChoice != 0);
    }

    public static void findExpensiveProductionCost(){
        List<Publisher> publishers = RepositoryBook.publisherList;
        Publisher highestProductionCost = publishers.get(0);
        for (Publisher publisher : publishers) {
            if (publisher.getProductionCost() > highestProductionCost.getProductionCost()){
                highestProductionCost = publisher;
            }
        }

        System.out.println("Publisher dengan production cost paling mahal");
        System.out.println(highestProductionCost);
    }

    public static void findCheapestProductionCost(){
        List<Publisher> publishers = RepositoryBook.publisherList;
        Publisher lowestProductionCost = publishers.get(0);
        for (Publisher publisher : publishers) {
            if (publisher.getProductionCost() < lowestProductionCost.getProductionCost()){
                lowestProductionCost = publisher;
            }
        }

        System.out.println("Publisher dengan production cost paling mahal");
        System.out.println(lowestProductionCost);
    }
}
