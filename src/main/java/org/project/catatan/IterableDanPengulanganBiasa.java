/**
 * Iterator dan perulangan biasa (seperti for, for each) di Java sama-sama digunakan untuk iterasi
 * melalui elemen dalam suatu koleksi.
 */

        /*
        ITERATOR
        Iterator<String> iterator = koleksi.iterator();
        while (iterator.hasNext()) {
            String elemen = iterator.next();
            // Proses elemen
        }
         */

        /*
        FOR
        for (int i = 0; i < koleksi.size(); i++) {
            String elemen = koleksi.get(i);
            // Proses elemen
        }
         */

        /*
        FOR EACH
        for (String elemen : koleksi) {
        // Proses elemen
        }
         */

/**
 * Iterator:
 *
 * 1. Lebih fleksibel:
 * - Memungkinkan iterasi mundur (iterator.hasPrevious(), iterator.previous())
 * - Memungkinkan penghapusan elemen saat iterasi (iterator.remove())
 * 2. Lebih aman:
 * - Mencegah ConcurrentModificationException saat iterasi dan modifikasi koleksi secara bersamaan
 * 3. Lebih umum:
 * - Dapat digunakan untuk iterasi di berbagai jenis koleksi, termasuk yang tidak memiliki akses acak (seperti Set)
 */

/**
 * Perulangan biasa:
 *
 * 1. Lebih sederhana:
 * - Sintaksnya lebih mudah dipahami dan digunakan
 * - Lebih efisien untuk iterasi maju pada koleksi dengan akses acak (seperti List)
 * 2. Terbatas:
 * - Tidak memungkinkan iterasi mundur atau penghapusan elemen saat iterasi
 * - Tidak aman jika koleksi dimodifikasi saat iterasi
 */

/**
 * KAPAN DIGUNAKAN?
 *
 * 1. Gunakan iterator:
 * - Saat Anda membutuhkan iterasi mundur atau penghapusan elemen saat iterasi
 * - Saat Anda perlu mengiterasi koleksi yang tidak memiliki akses acak
 * - Saat Anda ingin memastikan iterasi yang aman ketika koleksi dapat dimodifikasi secara bersamaan
 *
 * 2. Gunakan perulangan biasa:
 * - Saat Anda hanya membutuhkan iterasi maju sederhana
 * - Saat Anda mengiterasi koleksi dengan akses acak (seperti List)
 * - Saat Anda ingin kode yang lebih sederhana dan mudah dipahami
 */

/**
 * KESIMPULAN
 *
 * Iterator: lebih fleksibel, aman, dan umum, tetapi sintaksnya lebih rumit.
 * Perulangan biasa: lebih sederhana dan efisien untuk iterasi maju pada koleksi dengan akses acak, tetapi kurang fleksibel dan aman.
 * Pilihlah alat yang tepat untuk kebutuhan Anda.
 */