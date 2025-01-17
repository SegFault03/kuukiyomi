package tachiyomi.source.local.io

import com.hippo.unifile.UniFile
import tachiyomi.core.storage.extension

object ArchiveAnime {

    private val SUPPORTED_ARCHIVE_TYPES =
        listOf("avi", "flv", "mkv", "mov", "mp4", "webm", "wmv", "torrent", "m3u", "m3u8")

    fun isSupported(file: UniFile): Boolean = with(file) {
        return file.extension in SUPPORTED_ARCHIVE_TYPES
    }
}

object ArchiveManga {

    private val SUPPORTED_ARCHIVE_TYPES = listOf("zip", "cbz", "rar", "cbr", "epub")

    fun isSupported(file: UniFile): Boolean {
        return file.extension in SUPPORTED_ARCHIVE_TYPES
    }
}
