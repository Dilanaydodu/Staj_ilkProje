package com.dilanaydogdu.staj1

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.ouattararomuald.slider.ImageSlider
import com.ouattararomuald.slider.SliderAdapter
import com.ouattararomuald.slider.loaders.picasso.PicassoImageLoaderFactory
import kotlinx.android.synthetic.main.aaa.*
import kotlinx.android.synthetic.main.aaa.navigation_view1
import kotlinx.android.synthetic.main.aaa.toolbar
import kotlinx.android.synthetic.main.activity_aab.*
import kotlinx.android.synthetic.main.activity_main.*

class aab : AppCompatActivity() {
    lateinit var toogle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aab)
        toogle = ActionBarDrawerToggle(this,drawer_layout2 ,toolbar, R.string.open,R.string.close)
        drawer_layout2.addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navigation_view1.setNavigationItemSelectedListener {
            drawer_layout1.closeDrawer(navigation_view1)
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
    }
}