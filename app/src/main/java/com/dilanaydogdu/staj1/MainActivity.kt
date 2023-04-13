package com.dilanaydogdu.staj1

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.WebViewClient
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var toogle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://egebarkod.com")

        /*menubuton.setOnClickListener {
            toogle = ActionBarDrawerToggle(this, drawer_layout, R.string.open, R.string.close)
            drawer_layout.addDrawerListener(toogle)
            toogle.syncState()
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navigation_view.setNavigationItemSelectedListener {
                if (it.itemId == R.id.kurumsal) {
                    webview.getSettings().setJavaScriptEnabled(true)
                    webview.loadUrl("https://egebarkod.com/egebarkod-hakkimizda")
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


            } }*/

        toogle = ActionBarDrawerToggle(this, drawer_layout, R.string.open, R.string.close)
        drawer_layout.addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navigation_view.setNavigationItemSelectedListener {
            drawer_layout.closeDrawer(navigation_view)
            if (it.itemId == R.id.kurumsal) {
                webview.getSettings().setJavaScriptEnabled(true)
                webview.loadUrl("https://egebarkod.com/egebarkod-hakkimizda")
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


        button.setOnClickListener {
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
        button1.setOnClickListener {
            var mesaj = AlertDialog.Builder(this)
            mesaj.setTitle("İZİN")
            mesaj.setMessage("Haritayı Açmak İstiyor Musun?")
            mesaj.setPositiveButton(
                "EVET",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    webview.getSettings().setJavaScriptEnabled(true)
                    webview.loadUrl(
                        "https://www.google.com.tr/maps/place/Adalet,+1594%2F1.+Sk.+No:44," +
                                "+35530+Bayrakl%C4%B1%2F%C4%B0zmir/@38.4573014,27.1767257,17z/data=!3m1!4b1!4m5!" +
                                "3m4!1s0x14b962ab796fba75:0xa0a358a46ae8b96e!8m2!3d38.4572972!4d27.1789144?hl=tr"
                    )
                })
            mesaj.setNegativeButton(
                "HAYIR",
                DialogInterface.OnClickListener { dialogInterface, i ->
                })
            mesaj.show()
        }
        button2.setOnClickListener {
            val a = "ik@egebarkod.com"
            val addressees = arrayOf(a)
            var mesaj = AlertDialog.Builder(this)
            mesaj.setTitle("İZİN")
            mesaj.setMessage("Mail Göndermek İstiyor Musun?")
            mesaj.setPositiveButton(
                "EVET",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    val emailIntent = Intent(Intent.ACTION_SEND).apply {
                        putExtra(Intent.EXTRA_EMAIL, addressees)
                    }
                    emailIntent.setType("text/plain")
                    startActivity(emailIntent)
                })
            mesaj.setNegativeButton(
                "HAYIR",
                DialogInterface.OnClickListener { dialogInterface, i ->
                })
            mesaj.show()
        }
       /* navLogoImage.setOnClickListener {
            webview.getSettings().setJavaScriptEnabled(true)
            webview.webViewClient = WebViewClient()
            webview.loadUrl("https://egebarkod.com")

        }*/
    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            val menuinf = menuInflater
            menuinf.inflate(R.menu.anamenu, menu)
            return super.onCreateOptionsMenu(menu)
        }


        /* override fun onContextItemSelected(item: MenuItem) :Boolean {
       return when(item?.itemId) {
            R.id.anamenu->{ Toast.makeText(this,"anamenü",Toast.LENGTH_LONG).show() //webview.getSettings().setJavaScriptEnabled(true)
                //webview . webViewClient = WebViewClient ()
                //webview . loadUrl ("https://egebarkod.com")
                true}
            else-> super.onOptionsItemSelected(item)
        }
           return super.onContextItemSelected(item)

    }*/




        fun face(view: View) {
            webview.getSettings().setJavaScriptEnabled(true)
            webview.webViewClient = WebViewClient()
            webview.loadUrl("https://www.facebook.com/Egebarkod-102163452112763")
        }

        fun insta(view: View) {
            webview.getSettings().setJavaScriptEnabled(true)
            webview.webViewClient = WebViewClient()
            webview.loadUrl("https://www.instagram.com/egebarkod/")
        }

        /*  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuinf = menuInflater
        menuinf.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }*/

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (toogle.onOptionsItemSelected((item))) {
                return true
            }
            return when (item?.itemId) {
                R.id.anamenu -> {
                    webview.getSettings().setJavaScriptEnabled(true)
                    webview.webViewClient = WebViewClient()
                    webview.loadUrl("https://egebarkod.com")
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
            return super.onContextItemSelected(item)
        }
    }