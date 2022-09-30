package com.example.rizalaffirmation.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rizalaffirmation.R
import com.example.rizalaffirmation.model.Affirmation
/**
 * Adaptor untuk [RecyclerView] di [MainActivity]. Menampilkan objek data [Afirmasi].
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Berikan referensi ke tampilan untuk setiap item data
    // Item data kompleks mungkin memerlukan lebih dari satu tampilan per item, dan
    // Anda memberikan akses ke semua tampilan untuk item data dalam penampung tampilan.
    // Setiap item data hanyalah objek Afirmasi.

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }
    /**
     * Buat tampilan baru
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }
    /**
     * Mengganti konten tampilan
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
    }
    /**
     * Kembalikan ukuran kumpulan data
     */
    override fun getItemCount() = dataset.size
    }
