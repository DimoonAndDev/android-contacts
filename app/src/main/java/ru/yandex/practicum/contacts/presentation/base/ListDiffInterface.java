package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;
import ru.yandex.practicum.contacts.presentation.main.ContactUi;
import ru.yandex.practicum.contacts.presentation.sort.SortTypeUI;

public interface ListDiffInterface<T> {
    <T> boolean theSameAs(T object);

    boolean equals(Object object);
}
