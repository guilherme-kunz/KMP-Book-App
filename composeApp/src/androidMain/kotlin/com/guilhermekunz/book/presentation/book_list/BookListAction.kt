package com.guilhermekunz.book.presentation.book_list

import com.guilhermekunz.book.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChanged(val query: String): BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class OnTabSelected(val index: Int): BookListAction
}