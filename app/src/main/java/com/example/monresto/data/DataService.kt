package com.example.monresto.data

import com.example.monresto.R
import com.example.monresto.model.Article
import com.example.monresto.model.Menu


class DataService {

    val burger = Article(name = "Burger", image = R.drawable.burger)
    val charcu = Article(name = "Charcuterie", image = R.drawable.charcuterie)
    val cheescake = Article(name = "Cheescake citron Litchee", image = R.drawable.cheesecake_citon_litchi)
    val churros = Article(name = "Churros framboise", image = R.drawable.churros_et_creme_de_framboise)
    val crevette = Article(name = "Crevette aigre doux", image = R.drawable.crevette_aigre_doux)
    val fajitas = Article(name = "Fajitas", image = R.drawable.fajitas)
    val fondue = Article(name = "Fondue", image = R.drawable.fondue)
    val gaz = Article(name = "Gazpacho", image = R.drawable.gazpacho)
    val gateau = Article(name = "Gateau au chocolat suisse", image = R.drawable.geateau_au_chocolat_suisse)
    val glace = Article(name = "Glace thé vert", image = R.drawable.glace_th__vert)
    val mozza = Article(name = "mozza", image = R.drawable.mozza)
    val nachos = Article(name = "nachos", image = R.drawable.nachos)
    val nem = Article(name = "nem", image = R.drawable.nem)
    val nuggets = Article(name = "nuggets", image = R.drawable.nuggets)
    val pizza = Article(name = "pizza", image = R.drawable.pizza)
    val paella = Article(name = "paella", image = R.drawable.paella)
    val sopapilla = Article(name = "sopapilla", image = R.drawable.sopapilla)
    val sundae = Article(name = "sundae", image = R.drawable.sundae)
    val sushis = Article(name = "sushis", image = R.drawable.sushis)
    val teriyaki = Article(name = "teriyaki", image = R.drawable.teriyaki)
    val tiramisu = Article(name = "tiramisu", image = R.drawable.tiramisu)


    val americain = Menu(name = "Americain", entree = nuggets, plat = burger, dessert = sundae)
    val chinois = Menu(name = "Chinois", entree = nem, plat = crevette, dessert = cheescake)
    val espagnol = Menu(name = "Espagnol", entree = gaz, plat = paella, dessert = churros)
    val italien = Menu(name = "Italien", entree = mozza, plat = pizza, dessert = tiramisu)
    val japonais = Menu(name = "Japonais", entree = sushis, plat = teriyaki, dessert = glace)
    val mexicain = Menu(name = "Mexicain", entree = nachos, plat = fajitas, dessert = sopapilla)
    val suisse = Menu(name = "Suisse", entree = charcu, plat = fondue, dessert = gateau)

    val allMenu = listOf(americain, chinois, espagnol, italien, japonais, mexicain, suisse)
}