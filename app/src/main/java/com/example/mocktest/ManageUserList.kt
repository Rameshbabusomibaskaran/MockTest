package com.example.mocktest

object ManageUserList {

    val data:ArrayList<ManageUser>

    init{
        data= ArrayList()

        data.add(ManageUser("Venkatesh","Admin",R.drawable.ic_boy,R.drawable.ic_delete))
        data.add(ManageUser("Ramesh","TestConductor",R.drawable.ic_girl,R.drawable.ic_delete))
        data.add(ManageUser("Murali","TestConductor",R.drawable.ic_man,R.drawable.ic_delete))
        data.add(ManageUser("Bharath","Admin",R.drawable.ic_woman,R.drawable.ic_delete))
        data.add(ManageUser("Jeyanth","TestConductor",R.drawable.ic_boy,R.drawable.ic_delete))
        data.add(ManageUser("Rakesh","Admin",R.drawable.ic_girl,R.drawable.ic_delete))
    }
}