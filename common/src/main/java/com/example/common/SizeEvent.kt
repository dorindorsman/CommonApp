package com.example.common

sealed class SizeEvent{
    object Convert: SizeEvent()
    class  SetGender(val gender: String): SizeEvent()
    class SetFrom(val from : String) : SizeEvent()
    class SetTo(val to : String) : SizeEvent()
    class SetSize(val size : String) : SizeEvent()
    class SetResult(val result : String) : SizeEvent()
    object SetSizeList : SizeEvent()


}
