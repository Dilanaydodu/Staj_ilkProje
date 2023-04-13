package com.dilanaydogdu.staj1

import android.app.SearchManager
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.ColorSpace
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.load.model.Model
import com.ouattararomuald.slider.ImageSlider
import com.ouattararomuald.slider.SliderAdapter
import com.ouattararomuald.slider.loaders.picasso.PicassoImageLoaderFactory
import kotlinx.android.synthetic.main.aaa.*
import kotlinx.android.synthetic.main.activity_main.*

class aaa: AppCompatActivity() {
    val displayList=ArrayList<ColorSpace.Model>()
    private lateinit var imageSlider: ImageSlider
    private val imageUrls = arrayListOf(
        "https://egebarkod.com/images/thumbs/0000118_egebarkod1.jpeg",
        "https://egebarkod.com/images/thumbs/0000129_trendyol_entegrasyon_slider.jpeg",
        "https://egebarkod.com/images/thumbs/0000131_hepsiburada_entegrasyon_slider.jpeg",
        "https://egebarkod.com/images/thumbs/0000148_isinizi_buyutun_slider.jpeg")
    lateinit var toogle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aaa)
        imageSlider = findViewById(R.id.image_slider)
        imageSlider.adapter = SliderAdapter(
            this,
            PicassoImageLoaderFactory(),
            imageUrls = imageUrls,)
       //uygulamagelistirmeimage.setOnClickListener {
        //   startActivity(Intent(this, MainActivity::class.java))
     //  }
        toogle = ActionBarDrawerToggle(this,drawer_layout1 ,toolbar, R.string.open,R.string.close)
        drawer_layout1.addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navigation_view1.setNavigationItemSelectedListener {
            drawer_layout1.closeDrawer(navigation_view1)
            if (it.itemId == R.id.hakkimizda) {
                val intent = Intent(this,aab::class.java)
               startActivity(intent)
            }
            if (it.itemId == R.id.hizmetler) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com/egebarkod-hizmetlerimiz")
            }
            if (it.itemId == R.id.erpurunler) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com/korgun-herme-muhasebe-programi")
            }
            if (it.itemId == R.id.ticaret) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com/e-ticaret-cozumleri")
            }
            if (it.itemId == R.id.yazilim) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com/web-ve-masaustu-uygulama-gelistirme")
            }
            if (it.itemId == R.id.entegreyeri) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com")
            }
            if (it.itemId == R.id.iletisim) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com/blog")
            }
            if (it.itemId == R.id.blog) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com/blog")
            }
            true


        }
        imagebutontelefon.setOnClickListener {
            var mesaj = AlertDialog.Builder(this)
            mesaj.setTitle("İZİN")
            mesaj.setMessage("Arama Yapmak İstiyor Musunuz?")
            mesaj.setPositiveButton(
                "EVET",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    val number = Uri.parse("tel:02324353939")
                    val callIntent = Intent(Intent.ACTION_DIAL, number)
                    startActivity(callIntent)
                })
            mesaj.setNegativeButton(
                "HAYIR",
                DialogInterface.OnClickListener { dialogInterface, i ->
                })
            mesaj.show()
        }
        imagebutonmail.setOnClickListener {
            val adres= "ik@egebarkod.com"
            val addres = arrayOf(adres)
            var mesaj = AlertDialog.Builder(this)
            mesaj.setTitle("İZİN")
            mesaj.setMessage("Mail Göndermek İstiyor Musun?")
            mesaj.setPositiveButton(
                "EVET", DialogInterface.OnClickListener { dialogInterface, i ->
                    val emailIntent = Intent(Intent.ACTION_SEND).apply {
                        putExtra(Intent.EXTRA_EMAIL, addres)
                    }
                    emailIntent.setType("text/plain")
                    startActivity(emailIntent)
                })
            mesaj.setNegativeButton(
                "HAYIR", DialogInterface.OnClickListener { dialogInterface, i ->
                })
            mesaj.show()
        }
        imagebutonface.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(
                "fb://facewebmodal/f?href=https://facebook.com/Egebarkod-102163452112763")))
            intent.setPackage("com.facebook.android")
        }
        imagebutoninsta.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(
                "https://instagram.com/egebarkod?igshid=YmMyMTA2M2Y=")))
            intent.setPackage("com.instagram.android")
        }
        imagebutonharita.setOnClickListener {
            var mesaj = AlertDialog.Builder(this)
            mesaj.setTitle("İZİN")
            mesaj.setMessage("Haritayı Açmak İstiyor Musun?")
            mesaj.setPositiveButton(
                "EVET",DialogInterface.OnClickListener { dialogInterface, i ->
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Egebarkod+Bilgisayar+Ltd.%C5%9Eti/@38.45729,27.178915,15z/data=!4m5!3m4!1s0x0:0xfd7d5a047acc88ad!8m2!3d38.45729!4d27.178915")))
                    intent.setPackage("com.haritalar.android")  })
            mesaj.setNegativeButton(
                "HAYIR", DialogInterface.OnClickListener { dialogInterface, i ->
            })
        mesaj.show()
    }

        uygulamagelistirmeimage.setOnClickListener {
            startActivity(Intent(this, aab::class.java)) }
        eticaretimage.setOnClickListener {
            startActivity(Intent(this, aac::class.java)) }
        korgunimage.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java)) }
        erpimage.setOnClickListener {
            startActivity(Intent(this, aad::class.java)) }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search,menu)
        val menuItem=menu!!.findItem(R.id.searchview)
        if(menuItem!= null){
            val searchview=menuItem.actionView as SearchView
            searchview.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(p0: String?): Boolean {
                    return true
                }
                override fun onQueryTextChange(p0: String?): Boolean {
                   return true
                }
            })
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}