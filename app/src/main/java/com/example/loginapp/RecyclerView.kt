package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginapp.adapter.MyAdapter
import com.example.loginapp.databinding.ActivityRecyclerViewBinding
import com.example.loginapp.model.Item

class RecyclerView : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val daftarLagu = listOf(
            Item(R.drawable.asal, "Asal Kau Bahagia", """
        YangYang, kemarin ku melihatmu
Kau bertemu dengannya
Kurasa sekarang kau masih
Memikirkan tentang dia
Apa kurangnya aku di dalam hidupmu?
Hingga kau curangi aku
Katakanlah sekarang bahwa kau tak bahagia
Aku punya ragamu tapi tidak hatimu
Kau tak perlu berbohong, kau masih menginginkannya
Ku rela kau dengannya, asalkan kau bahagia
Yang, kurasa sekarang kau masih
Memikirkan tentang dia
Apa kurangnya aku di dalam hidupmu?
Hingga kau curangi aku
Katakanlah sekarang bahwa kau tak bahagia
Aku punya ragamu tapi tidak hatimu
Kau tak perlu berbohong, kau masih menginginkannya
Ku rela kau dengannya, asalkan kau bahagia
Oh-oh-uh
Katakanlah sekarang bahwa kau tak bahagia
Aku punya ragamu tapi tidak hatimu
Kau tak perlu berbohong, kau masih menginginkannya
Ku rela kau dengannya, asalkan kau bahagia
Oh, oh-uh
Asalkan kau bahagia
    """.trimIndent()),
            Item(R.drawable.awas, "Awas Jatuh Cinta", """
        Aku punya niat yang baik
Coba kuungkapkan padamu
Berharap kamu kan menjadi
Rencana besar dihidupku
Tapi kau bilang
Pergi sana
Kamu tak mau melihat diri ini selamanya
Awas nanti jatuh cinta
Cinta kepada diriku
Jangan-jangan kujodohmu
Kamu terlalu membenci
Membenci diriku ini
Awas nanti jatuh cinta padaku
Awas nanti jatuh cinta
Cinta kepada diriku
Jangan jangan kujodohmu
Kamu terlalu membenci
Membenci diri ku ini
Awas nanti jatuh cinta padaku (awas jatuh cinta cinta kepada diriku)
Jangan-jangan kujodohmu
Kamu terlalu membenci
Membenci diriku ini
Awas nanti jatuh cinta
Awas nanti jatuh cinta
Awas nanti jatuh cinta
Padaku
    """.trimIndent()),
            Item(R.drawable.apa, "Apa Kabar Sayang", """
       Seharian aku tak tenang
Seperti orang kebingungan
Pikiranku tak karuan
Khawatirkan kamu di sana
Tak tahu apa gerangan
Mungkinkah di sana kau rasa bahagia
Atau malah sebaliknya
Telah lama kita tidak bertemu
Tak pernah ku dengar berita tentangmu
Apa kabar kamu sayang apa kabar kamu sayang
Seharian aku tak tenang
Khawatirkan kamu di sana
Tak tahu apa gerangan
Mungkinkah di sana kau rasa bahagia
Atau malah sebaliknya
Telah lama kita tidak bertemu
Tak pernah ku dengar berita tentangmu
Apa kabar kamu sayang apa kabar kamu sayang
Aku kan terus mendoakanmu
Walau tak ku dengar berita tentangmu
Apa kabar kamu sayang apa kabar kamu sayang di sana

    """.trimIndent()),
            Item(R.drawable.nyong, "Nyong Timur", """
       Banyak yang bilang Nyong-Nyong Timur tu beda
Memang batul, Nyong Timur tu memang beda
Dari Maluku, NTT, Sulawesi, deng Papua
Jang tanya lai torang gagah samua
Senyum manis, pipi congka mama e
Yang biking banyak hati jatuh malele
Ai, ai, iya, laki-laki paling sadap lai
Trada lawang, Nyong Timur ni beda nah
Su kariting, mata manyala
Itu katong pung ciri khas, oh-hu-oh
Kalau soal hati jangan tanya-tanya
Nyong Timur itu setia
Anana timur main habis
Goyang badan kiri kanan coba tangkis
Mo kas kalah sapa kalau soal manis
Nyong Timur pung senyum macam hipnotis
Satu kali kedip mata bisa overdosis
Sulawesi, NTT sampe Papua deng Maluku
Laki-laki gagah-gagah su bersatu
Mari, mari gabung jangan malu-malu
Kalau Ade tanya, "Kaka dari mana?"
Kaka jawab, "Dari Papua"
Kulit hitam manis, senyum tipis-tipis
Pace ini tra ada dua
    """.trimIndent()),
            Item(R.drawable.luka, "Luka Baru", """
       Memang mudah saja bagimu
Datang dan menghilang
Rasa telah terlanjur kuberi
Butuh waktu lagi tuk mengobati hati
Sesaat kau hadir sembuhkan lukaku
Kukira kau sungguh
Kau beriku luka yang baru
Jangan singgah bila tak sungguh
Jangan beri perhatian lalu pergi
Semaumu menyakiti hatiku
Taukah kamu rasanya
Berulang kali jatuh hati
Pada orang yang salah
Rasa telah terlanjur kuberi
Butuh waktu lagi tuk mengobati hati
Sesaat kau hadir sembuhkan lukaku
Kukira kau sungguh
Kau beriku luka yang baru
Jangan singgah bila tak sungguh
Jangan beri perhatian lalu pergi
Semaumu menyakiti hatiku

Taukah kamu rasanya

    """.trimIndent()),
            Item(R.drawable.rumah, "Rumah Singgah", """
      Saat hatimu terluka
Akulah yang menemanimu
Membasuh air matamu
Namun, mengapa ketika
Hatimu t'lah tersenyum lagi
Aku yang kaulupa?
Tak sadarkah selama ini
Ku juga s'lalu menginginkanmu?
Jika memang ini tak ada harapan
Mengapa aku yang harus jadi tujuan?
Saat hatimu terluka, aku yang jadi obatnya
Tanpa pernah kauhargai cinta dan kasih yang setulus ini
Mengapa sulit
Mengapa sulit
Untuk ku bisa miliki hatimu?
Bahkan s'lama ini
Hadirku tak berharga untukmu, ho-ho-ho
Yang terjadi kini
Ku hanya rumah persinggahanmu
Di saat kau terluka
Dan di saat semuanya reda
Kau menghilang begitu saja
Dan di saat semuanya reda
Kau menghilang begitu saja
    """.trimIndent()),
            Item(R.drawable.pagi, "Pagi Pulang Pagi", """
     Aku sayang padamu
Aku cinta padamu
Semua kan kulakukan
Demi kebahagiaanmu
Tak pernah ku keluhkan.
Walau rintangan menghadang
Panas hujan begini
Makanan sehari-hari
Kurela Pergi Pagi Pulang Pagi
Hanya untuk mengais rezeki..
Doakan saja aku pergi
S’moga pulang dompetku terisi
Kamu tak perlu resah
Aku sedang berusaha..
Demi kebahagiaan kamu yang aku sayangi
Tak pernah ku keluhkan.
Walau rintangan menghadang
Panas hujan begini
Makanan sehari-hari
Kurela Pergi Pagi Pulang Pagi
Hanya untuk mengais rezeki..
Kau doakan saja aku pergi
S’moga pulang dompetku terisi…
S’moga pulang dompetku terisi…
Dan semoga..aa..aaa..aaa…
kau nggak ngambek lagi
    """.trimIndent()),
            Item(R.drawable.esok, "Elegi Esok Pagi", """
       Ijinkanlah kukecup keningmu
Bukan hanya ada di dalam angan
Esok pagi kau buka jendela
Kan kau dapati seikat kembang merah
Engkau tahu aku mulai bosan
Bercumbu dengan bayang-bayang
Bantulah aku temukan diri
Menyambut pagi membuang sepi
Ijinkanlah aku kenang
Sejenak perjalanan
Ho
Dan biarkan ku mengerti
Apa yang tersimpan di matamu
Ho
Barangkali di tengah telaga
Ada tersisa butiran cinta
Dan semoga kerinduan ini
Bukan jadi mimpi di atas mimpi
Ijinkanlah aku rindu
Pada hitam rambutmu
Ho
Dan biarkan ku bernyanyi
Demi hati yang risau ini
Ho
Barangkali di tengah telaga
Ada tersisa butiran cinta
Dan semoga kerinduan ini
Bukan jadi mimpi di atas mimpi
    """.trimIndent()),
            // Item lainnya tetap menggunakan deskripsi sebelumnya
            Item(R.drawable.masih, "Masih Ada Waktu", """
       Bila masih mungkin kita menorehkan batin
Atas nama jiwa dan hati tulus ikhlas
Mumpung masih ada kesempatan buat kita
Mengumpulkan bekal perjalanan abadi
Kita pasti ingat tragedi yang memilukan
Kenapa harus mereka yang terpilih menghadap
Tentu ada hikmah yang harus kita petik
Atas nama jiwa mari heningkan cipta
Kita mesti bersyukur bahwa kita masih diberi waktu
Entah sampai kapan tak ada yang bakal dapat menghitung
Hanya atas kasih-Nya, hanya atas kehendak-Nya
Kita masih bertemu matahari
Kepada rumput ilalang, kepada bintang gemintang
Kita dapat mencoba meminjam catatan-Nya
Sampai kapankah gerangan
Waktu yang masih tersisa
Semuanya menggeleng, semuanya terdiam
Semuanya menjawab tak mengerti
Yang terbaik hanyalah segera bersujud
Mumpung kita masih diberi waktu
    """.trimIndent()),
            Item(R.drawable.hanya, "Hanya Rindu", """
       Saat ku sendiri kulihat photo dan video
Bersamamu yang tlah lama kusimpan
Hancur hati ini melihat semua gambar diri
Yang tak bisa ku ulang kembali
Kuingin saat ini engkau ada di disini
Tertawa bersamaku seperti dulu lagi
Walau hanya sebentar Tuhan tolong kabulkanlah
Bukannya diri ini tak terima kenyataan
Hati Ini hanya rindu
Segala cara telah kucoba
Agar aku bisa tanpa dirimu oh
Namun semua berbeda
Sulitku menghapus kenangan bersamamu
Kuingin saat ini engkau ada di disini
Tertawa bersamaku seperti dulu lagi
Walau hanya sebentar Tuhan tolong kabulkanlah
Bukannya diri ini tak terima kenyataan
Hati Ini hanya rindu oh
Hanya rindu
Kuingin saat ini engkau ada di disini
Tertawa bersamaku seperti dulu lagi
Walau hanya sebentar Tuhan tolong kabulkanlah
Bukannya diri ini tak terima kenyataan
Oh bukannya diri ini tak terima kenyataan
Hati Ini hanya rindu oh
Hati Ini hanya rindu hm
Kurindu senyummu Ibu
    """.trimIndent()),
            Item(R.drawable.ibu, "Ibu", """
       Ribuan kilo jalan yang kau tempuh
Lewati rintang untuk aku, anakmu
Ibuku sayang, masih terus berjalan
Walau tapak kaki penuh darah, penuh nanah
Seperti udara
Kasih yang engkau berikan
Tak mampu ku membalas Ibu
Ibu
Ingin kudekap
Dan menangis di pangkuanmu
Sampai aku tertidur
Bagai masa kecil dulu
Lalu doa-doa
Baluri sekujur tubuhku
Dengan apa membalas Ibu?
Ibu
Ribuan kilo jalan yang kau tempuh
Lewati rintang untuk aku, anakmu
Ibuku sayang, masih terus berjalan
Walau tapak kaki penuh darah, penuh nanah
Seperti udara
Kasih yang engkau berikan
Tak mampu ku membalas Ibu
Ibu
    """.trimIndent()),
            Item(R.drawable.komang, "", """Komang
       Dari kejauhan, tergambar cerita tentang kita
Terpisah jarak dan waktu
Ingin kuungkapkan rindu lewat kata indah
Tak cukup untuk dirimu
Sebab kau terlalu indah dari sekedar kata
Dunia berhenti sejenak menikmati indahmu
Dan apabila tak bersamamu
Kupastikan kujalani dunia tak seindah kemarin
Sederhana, tertawamu sudah cukup
Lengkapi sempurnanya hidup bersamamu
Jika hari kulalui tanpa hawamu
Percuma senyumku dengan dia, oh
Dan apabila tak bersamamu
Kupastikan kujalani dunia tak seindah kemarin
Sederhana, tertawamu sudah cukup
Lengkapi sempurnanya hidup bersamamu
Apabila tak bersamamu
Kupastikan kujalani dunia tak seindah kemarin
Sederhana, tertawamu sudah cukup
Lengkapi sempurnanya hidup bersamamu
Hu-uh-uh
Hu, hu-uh-uh
Sebab kau terlalu indah dari sekedar kata
Dunia berhenti sejenak menikmati indahmu
    """.trimIndent()),
            Item(R.drawable.ayah, "Ayah", """
     Engkaulah nafasku
Yang menjaga di dalam hidupku
Kau ajarkan aku menjadi yang terbaik
Kau tak pernah lelah
Sebagai penopang dalam hidupku
Kau berikan aku semua yang terindah
Aku hanya memanggilmu ayah
Di saat ku kehilangan arah
Aku hanya mengingatmu ayah
Jika aku tlah jauh darimu
Kau tak pernah lelah
Sebagai penopang dalam hidupku
Kau berikan aku semua yang terindah
Aku hanya memanggilmu ayah
Di saat ku kehilangan arah
Aku hanya mengingatmu ayah
Jika aku tlah jauh darimu
Aku hanya memanggilmu ayah
Di saat ku kehilangan arah
Aku hanya mengingatmu ayah
Jika aku tlah jauh darimu
    """.trimIndent()),
            Item(R.drawable.lesung, "Lesung Pipi", """
       Tatkala mentari
Terbenang di ufuk barat
Disaat itulah
Dingin rindu selimuti
Keindahan senyuman dari
Lesung pipi itu
Menikmati imaji bersamamu
Maka terimalah diriku
Kita akan bahagia selamanya
Ku berjanji jadi suamimu
Dan ku akan memberikan yang terbaik untukmu
Ku sadar lirikku
Tak seindah lagu indie
Yang slalu kau dengar
Meracuni telingamu
Ku pastikan ini bukan tentang senja dan lara
Sahajamu warnai duniaku
Maka terimalah diriku
Kita akan bahagia selamanya
Ku berjanji jadi suamimu
Dan ku akan memberikan yang terbaik untukmu
Perbedaan buat kita terus bersama
Izinkan ku jaga hatimu hu
Maka terimalah diriku
Kita akan bahagia selamanya
Ku berjanji jadi suamimu
Dan ku akan memberikan yang terbaik untukmu
Karena itu tugas cinta memberikan keindahan
Meskipun hidup
Tak selalu indah
Meskipun hidup Tak selalu indah
    """.trimIndent()),
            Item(R.drawable.kukira, "Kukira Kau Rumah", """
       Kau datang tak kala sinar senjaku telah redup
Dan pamit ketika purnamaku penuh seutuhnya
Kau yang singgah tapi tak sungguh
Kau yang singgah tapi tak sungguh
Kukira kau rumah
Nyatanya kau cuma aku sewa
Dari tubuh seorang perempuan
Yang memintamu untuk pulang
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
Kukira kau rumah
Nyatanya kau cuma aku sewa
Dari tubuh seorang perempuan
Yang memintamu untuk pulang
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
Kau bukan rumah
    """.trimIndent()),
            Item(R.drawable.lumpuh, "Lumpuhkanlah Ingatanku", """
      Jangan sembunyi
Ku mohon padamu jangan sembunyi
Sembunyi dari apa yang terjadi
Tak seharusnya hatimu kau kunci
Bertanya cobalah bertanya pada semua
Di sini ku coba untuk bertahan
Ungkapkan semua yang ku rasakan
Kau acuhkan aku
Kau diamkan aku
Kau tinggalkan aku
Lumpuhkanlah ingatanku
Hapuskan tentang dia
Ku ingin ku lupakannya
Jangan sembunyi
Ku mohon padamu jangan sembunyi
Sembunyi dari apa yang terjadi
Tak seharusnya hatimu kau kunci
Lumpuhkanlah ingatanku
Hapuskan tentang dia
Hapuskan memoriku tentangnya
Hilangkanlah ingatanku jika itu tentang dia
Ku ingin ku lupakannya
Lumpuhkanlah ingatanku
Hapuskan tentang dia
Hapuskan memoriku tentangnya
Hilangkanlah ingatanku jika itu tentang dia
Ku ingin ku lupakannya
Lumpuhkanlah ingatanku
Hapuskan tentang dia
Ku ingin ku lupakannya

    """.trimIndent()),

        )



        binding.recyclerViewLagu.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewLagu.adapter = MyAdapter(daftarLagu) { item ->
            val intent = Intent(this, ItemData::class.java)
            intent.putExtra("item", item)
            startActivity(intent)
        }
    }
}
