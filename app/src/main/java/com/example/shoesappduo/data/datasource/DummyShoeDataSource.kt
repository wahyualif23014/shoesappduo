package com.example.shoesappduo.data.datasource
import com.example.shoesappduo.data.model.Shoe

object DummyShoeDataSource {

    fun getShoesData(): List<Shoe> {
        return listOf(
            Shoe(
                id = 1,
                name = "Running Pro X",
                brand = "SportyBrand",
                price = "Rp 1.200.000",
                description = "Sepatu lari ultra-ringan dengan teknologi bantalan terbaru, cocok untuk marathon dan lari jarak jauh.",
                photoUrl = "https://images.pexels.com/photos/19090/pexels-photo.jpg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            ),
            Shoe(
                id = 2,
                name = "Casual Walker",
                brand = "UrbanFlex",
                price = "Rp 750.000",
                description = "Sepatu kasual yang nyaman untuk berjalan santai di perkotaan. Desain minimalis dan elegan.",
                photoUrl = "https://images.pexels.com/photos/267301/pexels-photo-267301.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            ),
            Shoe(
                id = 3,
                name = "Trekking Peak",
                brand = "MountainGear",
                price = "Rp 1.850.000",
                description = "Sepatu trekking tahan air dengan sol anti-slip, dirancang untuk medan berat dan petualangan alam bebas.",
                photoUrl = "https://images.pexels.com/photos/2014690/pexels-photo-2014690.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            ),
            Shoe(
                id = 4,
                name = "Skate Classic",
                brand = "BoardLife",
                price = "Rp 950.000",
                description = "Sepatu skate dengan bahan kanvas yang kuat dan sol datar untuk cengkeraman maksimal di atas papan.",
                photoUrl = "https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            ),
            Shoe(
                id = 5,
                name = "Formal Oxford",
                brand = "Gentleman Wear",
                price = "Rp 2.150.000",
                description = "Sepatu kulit asli untuk acara formal. Dibuat dengan tangan untuk kenyamanan dan gaya yang tak lekang oleh waktu.",
                photoUrl = "https://images.pexels.com/photos/292999/pexels-photo-292999.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            )
        )
    }
}