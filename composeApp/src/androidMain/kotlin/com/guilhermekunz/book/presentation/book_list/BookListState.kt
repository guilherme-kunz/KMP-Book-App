package com.guilhermekunz.book.presentation.book_list

import com.guilhermekunz.book.domain.Book
import com.guilhermekunz.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val books: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
