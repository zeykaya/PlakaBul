package com.kaya.plakabul


import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaya.plakabul.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            if (binding.editTextNumber.text.isNotEmpty()){
                var plakaKodu=binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    1->binding.textView.text="ADANA"
                    2->binding.textView.text="ADIYAMAN"
                    3->binding.textView.text="AFYON"
                    4->binding.textView.text="AĞRI"
                    5->binding.textView.text="AMASYA"
                    6->binding.textView.text="ANKARA"
                    7->binding.textView.text="ANTALYA"
                    8->binding.textView.text="ARTVİN"
                    9->binding.textView.text="AYDIN"
                    10->binding.textView.text="BALIKESİR"
                    11->binding.textView.text="BİLECİK"
                    12->binding.textView.text="BİNGÖL"
                    13->binding.textView.text="BİTLİS"
                    14->binding.textView.text="BOLU"
                    15->binding.textView.text="BURDUR"
                    16->binding.textView.text="BURSA"
                    17->binding.textView.text="ÇANAKKALE"
                    18->binding.textView.text="ÇANKIRI"
                    19->binding.textView.text="ÇORUM"
                    20->binding.textView.text="DENİZLİ"
                    21->binding.textView.text="DİYARBAKIR"
                    22->binding.textView.text="EDİRNE"
                    23->binding.textView.text="ELAZIĞ"
                    24->binding.textView.text="ERZİNCAN"
                    25->binding.textView.text="ERZURUM"
                    26->binding.textView.text="ESKİŞEHİR"
                    27->binding.textView.text="GAZİANTEP"
                    28->binding.textView.text="GİRESUN"
                    29->binding.textView.text="GÜMÜŞHANE"
                    30->binding.textView.text="HAKKARİ"
                    31->binding.textView.text="HATAY"
                    32->binding.textView.text="ISPARTA"
                    33->binding.textView.text="MERSİN"
                    34->binding.textView.text="İSTANBUL"
                    35->binding.textView.text="İZMİR"
                    36->binding.textView.text="KARS"
                    37->binding.textView.text="KASTAMONU"
                    38->binding.textView.text="KAYSERİ"
                    39->binding.textView.text="KIRKLARELİ"
                    40->binding.textView.text="KIRŞEHİR"
                    41->binding.textView.text="KOCAELİ"
                    42->binding.textView.text="KONYA"
                    43->binding.textView.text="KÜTAHYA"
                    44->binding.textView.text="MALATYA"
                    45->binding.textView.text="MANİSA"
                    46->binding.textView.text="KAHRAMANMARAŞ"
                    47->binding.textView.text="MARDİN"
                    48->binding.textView.text="MUĞLA"
                    49->binding.textView.text="MUŞ"
                    50->binding.textView.text="NEVŞEHİR"
                    51->binding.textView.text="NİĞDE"
                    52->binding.textView.text="ORDU"
                    53->binding.textView.text="RİZE"
                    54->binding.textView.text="SAKARYA"
                    55->binding.textView.text="SAMSUN"
                    56->binding.textView.text="SİİRT"
                    57->binding.textView.text="SİNOP"
                    58->binding.textView.text="SİVAS"
                    59->binding.textView.text="TEKİRDAĞ"
                    60->binding.textView.text="TOKAT"
                    61->binding.textView.text="TRABZON"
                    62->binding.textView.text="TUNCELİ"
                    63->binding.textView.text="ŞANLIURFA"
                    64->binding.textView.text="UŞAK"
                    65->binding.textView.text="VAN"
                    66->binding.textView.text="YOZGAT"
                    67->binding.textView.text="ZONGULDAK"
                    68->binding.textView.text="AKSARAY"
                    69->binding.textView.text="BAYBURT"
                    70->binding.textView.text="KARAMAN"
                    71->binding.textView.text="KIRIKKALE"
                    72->binding.textView.text="BATMAN"
                    73->binding.textView.text="ŞIRNAK"
                    74->binding.textView.text="BARTIN"
                    75->binding.textView.text="ARDAHAN"
                    76->binding.textView.text="IĞDIR"
                    77->binding.textView.text="YALOVA"
                    78->binding.textView.text="KARABÜK"
                    79->binding.textView.text="KİLİS"
                    80->binding.textView.text="OSMANİYE"
                    81->binding.textView.text="DÜZCE"

                    else->{
                      binding.textView.text="Şehir Bulunamadı"
                    }
                }
            }

            else{
                binding.textView.text="Şehir Plaka Kodunu Giriniz"
            }

             binding.editTextNumber.text.clear()
        }
    }
}