package com.example.hiremp

import com.yalantis.filter.model.FilterModel

class Tag(
    private var tag: String
) : FilterModel {
    override fun getText() = tag
}