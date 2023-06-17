package pbo.kendaraan;

class Kendaraan {
    //enkapsulasi
    private int jmlRoda; // Atribut privat untuk menyimpan jumlah roda
    private String warna; // Atribut privat untuk menyimpan warna

    public void setJmlRoda(int jmlRoda) { // Setter untuk mengatur jumlah roda
        this.jmlRoda = jmlRoda;
    }

    public int getJmlRoda() { // Getter untuk mendapatkan jumlah roda
        return jmlRoda;
    }

    public void setWarna(String warna) { // Setter untuk mengatur warna
        this.warna = warna;
    }

    public String getWarna() { // Getter untuk mendapatkan warna
        return warna;
    }
}

class Mobil extends Kendaraan {
    private String bahanBakar; // Atribut privat untuk menyimpan jenis bahan bakar
    private int kapasitasMesin; // Atribut privat untuk menyimpan kapasitas mesin

    public void setBahanBakar(String bahanBakar) { // Setter untuk mengatur jenis bahan bakar
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() { // Getter untuk mendapatkan jenis bahan bakar
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) { // Setter untuk mengatur kapasitas mesin
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() { // Getter untuk mendapatkan kapasitas mesin
        return kapasitasMesin;
    }
}

class Sepeda extends Kendaraan {
    private String jmlSadel; // Atribut privat untuk menyimpan jumlah sadel
    private int jmlGir; // Atribut privat untuk menyimpan jumlah gigi

    public void setJmlSadel(String jmlSadel) { // Setter untuk mengatur jumlah sadel
        this.jmlSadel = jmlSadel;
    }

    public String getJmlSadel() { // Getter untuk mendapatkan jumlah sadel
        return jmlSadel;
    }

    public void setJmlGir(int jmlGir) { // Setter untuk mengatur jumlah gigi
        this.jmlGir = jmlGir;
    }

    public int getJmlGir() { // Getter untuk mendapatkan jumlah gigi
        return jmlGir;
    }
}

class Truk extends Mobil {
    private int muatanMaks; // Atribut privat untuk menyimpan muatan maksimum

    public void setMuatanMaks(int muatanMaks) { // Setter untuk mengatur muatan maksimum
        this.muatanMaks = muatanMaks;
    }

    public int getMuatanMaks() { // Getter untuk mendapatkan muatan maksimum
        return muatanMaks;
    }
}

class Taksi extends Mobil {
    private int tarifAwal; // Atribut privat untuk menyimpan tarif awal
    private int tarifPerKM; // Atribut privat untuk menyimpan tarif per KM

    public void setTarifAwal(int tarifAwal) { // Setter untuk mengatur tarif awal
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal() { // Getter untuk mendapatkan tarif awal
        return tarifAwal;
    }

    public void setTarifPerKM(int tarifPerKM) { // Setter untuk mengatur tarif per KM
        this.tarifPerKM = tarifPerKM;
    }

    public int getTarifPerKM() { // Getter untuk mendapatkan tarif per KM
        return tarifPerKM;
    }
}

public class Main {
    public static void main(String[] args) {
        // Exception Handling
        try {
            Kendaraan taksi = new Taksi(); // Membuat objek taksi dari kelas Taksi (polimorfisme)

            taksi.setJmlRoda(4); // Mengatur jumlah roda taksi
            taksi.setWarna("Kuning"); // Mengatur warna taksi

            if (taksi instanceof Taksi) { // Memeriksa apakah objek taksi merupakan instance dari kelas Taksi
                Taksi taksiObj = (Taksi) taksi; // Mengkonversi objek taksi menjadi objek Taksi
                taksiObj.setBahanBakar("Bensin"); // Mengatur jenis bahan bakar taksi
                taksiObj.setKapasitasMesin(2000); // Mengatur kapasitas mesin taksi
                taksiObj.setTarifAwal(5000); // Mengatur tarif awal taksi
                taksiObj.setTarifPerKM(3000); // Mengatur tarif per KM taksi
            }

            System.out.println("Taksi:");
            System.out.println("Jumlah Roda: " + taksi.getJmlRoda()); // Mendapatkan jumlah roda taksi
            System.out.println("Warna: " + taksi.getWarna()); // Mendapatkan warna taksi

            if (taksi instanceof Taksi) { // Memeriksa apakah objek taksi merupakan instance dari kelas Taksi
                Taksi taksiObj = (Taksi) taksi; // Mengkonversi objek taksi menjadi objek Taksi
                System.out.println("Bahan Bakar: " + taksiObj.getBahanBakar()); // Mendapatkan jenis bahan bakar taksi
                System.out.println("Kapasitas Mesin: " + taksiObj.getKapasitasMesin()); // Mendapatkan kapasitas mesin taksi
                System.out.println("Tarif Awal: " + taksiObj.getTarifAwal()); // Mendapatkan tarif awal taksi
                System.out.println("Tarif per KM: " + taksiObj.getTarifPerKM()); // Mendapatkan tarif per KM taksi
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
