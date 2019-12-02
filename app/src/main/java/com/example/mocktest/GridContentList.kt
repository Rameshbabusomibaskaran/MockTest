package com.example.mocktest

object GridContentList {

    val datas:ArrayList<GridContent>

    init{
        datas= ArrayList()
        datas.add(GridContent(R.drawable.ic_add_user))
        datas.add(GridContent( R.drawable.ic_test ))
        datas.add(GridContent(R.drawable.ic_magnifying_glass))
        datas.add(GridContent(R.drawable.ic_analytics))

    }
}