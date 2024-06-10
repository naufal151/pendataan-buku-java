package repository;

import java.util.ArrayList;
import java.util.List;

import model.Author;
import model.Comic;
import model.Mangaka;
import model.Novel;
import model.Novelis;
import model.Publisher;
import model.Ebook;

public class RepositoryBook {
    static Author haidarMusyafa = new Author("Haidar", "Musyafa", "Indonesia", 30);
    static Author bertBates = new Author("Bert", "Bates", "United State", 50);
    static Author barryBurd = new Author("Barry", "Burd", "United State", 52);
    static Author markManson = new Author("Mark", "Manson", "United State", 38);
    static Author andiSusanto = new Author("Andi", "Susanto", "Indonesia", 32);
    static Author adiSusanto = new Author("Adi", "Sutanto", "Indonesia", 27);

    public static List<Author> authorList = new ArrayList<>();
    static {
        authorList.add(haidarMusyafa);
        authorList.add(bertBates);
        authorList.add(barryBurd);
        authorList.add(markManson);
        authorList.add(andiSusanto);
        authorList.add(adiSusanto);
    }


    static Novelis jKRowling = new Novelis("J.K", "Rowling", "England", 57, true, "Best Seller");
    static Novelis tereLiye = new Novelis("Tere", "Liye", "Indonesia", 35, true, "Best Seller");
    static Novelis deeLestari = new Novelis("Dee", "Lestari", "Indonesia", 30, true, "Good");
    static Novelis faisalSyahreza = new Novelis("Faisal", "Syahreza", "Indonesia", 40, true, "New Commer");
    static Novelis juliaGolding = new Novelis("Julia", "Golding", "England", 41, false, "Best Seller");
    
    public static List<Novelis> novelisList = new ArrayList<>();
    static {
        novelisList.add(jKRowling);
        novelisList.add(tereLiye);
        novelisList.add(deeLestari);
        novelisList.add(faisalSyahreza);
        novelisList.add(juliaGolding);
    }

    static Mangaka masashiKisimoto = new Mangaka("Masashi", "Kisimoto", "Japan", 48, "Best Seller");
    static Mangaka yoshihiroTogashi = new Mangaka("Yoshihiro", "Togashi", "Japan", 56, "Good");
    static Mangaka eiichiroOda = new Mangaka("Eiichiro", "Oda", "Japan", 57, "Best Seller");
    static Mangaka rizkiAnwar = new Mangaka("Rizki", "Anwar", "Indonesia", 25, "New Commer");
    static Mangaka yusufFadli = new Mangaka("Yusuf", "Fadli", "Indonesia", 32, "New Commer");

    public static List<Mangaka> mangakaList = new ArrayList<>();
    static {
        mangakaList.add(masashiKisimoto);
        mangakaList.add(yoshihiroTogashi);
        mangakaList.add(eiichiroOda);
        mangakaList.add(rizkiAnwar);
        mangakaList.add(yusufFadli);
    }

    static Publisher bloomsbury = new Publisher("Bloomsbury", "United Kingdom", 30);
    static Publisher gramedia = new Publisher("Gramedia", "Indonesia", 50);
    static Publisher mizan = new Publisher("Mizan", "Indonesia", 25);
    static Publisher shueisha = new Publisher("Shueisha", "Japan", 25);
    static Publisher elexMediaKomputindo = new Publisher("Elex Media Komputindo", "Indonesia", 12);
    static Publisher gramediaPustakaUtama = new Publisher("Gramedia Pustaka Utama", "Indonesia", 15);
    static Publisher lionHudson = new Publisher("Lion Hudson", "England", 15);
    static Publisher oReillyMedia = new Publisher("O Reilly Media", "United State", 30);
    static Publisher harperOne = new Publisher("Harper One", "United State", 25);

    public static List<Publisher> publisherList = new ArrayList<>();
    static {
        publisherList.add(bloomsbury);
        publisherList.add(gramedia);
        publisherList.add(mizan);
        publisherList.add(shueisha);
        publisherList.add(elexMediaKomputindo);
        publisherList.add(gramediaPustakaUtama);
        publisherList.add(lionHudson);
        publisherList.add(oReillyMedia);
        publisherList.add(harperOne);
    }

    public static List<Ebook> getAllBooks(){
        Ebook ebook1 = new Ebook("Book - 001", "Memahami Hamka", haidarMusyafa, mizan);
        Ebook ebook2 = new Ebook("Book - 002", "Head First Java: Your Brain on Java - A Learner's Guide", bertBates, oReillyMedia);
        Ebook ebook3 = new Ebook("Book - 003", "Java For Dummies", barryBurd, oReillyMedia);
        Ebook ebook4 = new Ebook("Book - 004", "Flutter For Dummies", barryBurd, oReillyMedia);
        Ebook ebook5 = new Ebook("Book - 005", "The Subtle Art of Not Giving", markManson, harperOne);
        Ebook ebook6 = new Ebook("Book - 006", "Will", markManson, harperOne);
        Ebook ebook7 = new Ebook("Book - 007", "Sejarah Indonesia", andiSusanto, gramediaPustakaUtama);
        Ebook ebook8 = new Ebook("Book - 008", "Teknologi Baru", adiSusanto, elexMediaKomputindo);
        Ebook novel1 = new Novel("Novel - 001", "Harry Potter and the Philosopher's Stone", jKRowling, bloomsbury, "Fantasy");
        Ebook novel2 = new Novel("Novel - 002", "Harry Potter and the Chamber of Secrets", jKRowling, bloomsbury, "Fantasy");
        Ebook novel3 = new Novel("Novel - 003", "Harry Potter and the Prisoner of Azkaban", jKRowling, bloomsbury, "Fantasy");
        Ebook novel4 = new Novel("Novel - 004", "Ayah Aku Berbeda", tereLiye, gramedia, "Drama");
        Ebook novel5 = new Novel("Novel - 005", "Madre", deeLestari, gramedia, "Drama");
        Ebook novel6 = new Novel("Novel - 006", "Lagu untuk Renjana", faisalSyahreza, mizan, "Drama");
        Ebook novel7 = new Novel("Novel - 007", "Semoga Lekas Lega", faisalSyahreza, mizan, "Drama");
        Ebook novel8 = new Novel("Novel - 008", "The Abbey Mystery", juliaGolding, lionHudson, "Fiction");
        Ebook comic1 = new Comic("Comic - 001", "Uzumaki Naruto", masashiKisimoto, shueisha, true);
        Ebook comic2 = new Comic("Comic - 002", "The Worst Client", masashiKisimoto, shueisha, true);
        Ebook comic3 = new Comic("Comic - 003", "For the Sake of Dreams...!!", masashiKisimoto, shueisha, true);
        Ebook comic4 = new Comic("Comic - 004", "Hunter X Hunter : The Day of Departure", yoshihiroTogashi, shueisha, true);
        Ebook comic5 = new Comic("Comic - 005", "Hunter X Hunter : A Struggle in the Mist", yoshihiroTogashi, shueisha, true);
        Ebook comic6 = new Comic("Comic - 006", "One Piece", eiichiroOda, gramedia, true);
        Ebook comic7 = new Comic("Comic - 007", "Petualangan di Indonesia", rizkiAnwar, gramediaPustakaUtama, false);
        Ebook comic8 = new Comic("Comic - 008", "Petualangan di Jakarta", yusufFadli, elexMediaKomputindo, false);

        List<Ebook> bookList = new ArrayList<>();
        bookList.add(ebook1);
        bookList.add(ebook2);
        bookList.add(ebook3);
        bookList.add(ebook4);
        bookList.add(ebook5);
        bookList.add(ebook6);
        bookList.add(ebook7);
        bookList.add(ebook8);
        bookList.add(novel1);
        bookList.add(novel2);
        bookList.add(novel3);
        bookList.add(novel4);
        bookList.add(novel5);
        bookList.add(novel6);
        bookList.add(novel7);
        bookList.add(novel8);
        bookList.add(comic1);
        bookList.add(comic2);
        bookList.add(comic3);
        bookList.add(comic4);
        bookList.add(comic5);
        bookList.add(comic6);
        bookList.add(comic7);
        bookList.add(comic8);

        return bookList;
    }
}
