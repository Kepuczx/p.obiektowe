public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("Błażej", 20, "pakujący");
        Elf elf1 = new Elf("Adam", 17, "pakujący");
        Elf elf2 = new Elf("Robert", 54, "pakujący");
        elf.przedstawSie();

        Fabryka fabryka = new Fabryka(160, 54);
        fabryka.dodajPracownika(elf);
        fabryka.dodajPracownika(elf1);
        fabryka.dodajPracownika(elf2);
        Elf elf3 = fabryka.najstarszyPracownik();
        elf3.przedstawSie();


        Renifer renifer = new Renifer("Bambi", 20);
        Renifer renifer1 = new Renifer("Robert", 11);
        Renifer renifer2 = new Renifer("Szybcior", 30);
        renifer.nakarmRenifera();
        System.out.println(renifer.getPredkosc());

        Sanie sanie = new Sanie();
        sanie.dodajRenifera(renifer);
        sanie.dodajRenifera(renifer1);
        sanie.dodajRenifera(renifer2);

        Renifer renifer3 = sanie.najwolniejszyRenifer();
        System.out.println(renifer3.getImie());

    }
}