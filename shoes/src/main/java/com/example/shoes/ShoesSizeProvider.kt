package com.example.shoes

import com.example.common.DataProvider
import com.example.common.GenderType
import com.example.common.Size

object ShoesSizeProvider: DataProvider {
    override fun provide(): List<Size>{
        return listOf(
            Size(gender = GenderType.BABYS, uk = "0", us = "0", eu = "15"),
            Size(gender = GenderType.BABYS, uk = "0.5", us = "1", eu = "16"),
            Size(gender = GenderType.BABYS, uk = "1", us = "1.5", eu = "17"),
            Size(gender = GenderType.BABYS, uk = "1", us = "2", eu = "17"),
            Size(gender = GenderType.BABYS, uk = "1.5", us = "2.5", eu = "18"),
            Size(gender = GenderType.BABYS, uk = "2", us = "3", eu = "18"),
            Size(gender = GenderType.BABYS, uk = "2.5", us = "3.5", eu = "19"),
            Size(gender = GenderType.BABYS, uk = "3", us = "4", eu = "19"),
            Size(gender = GenderType.BABYS, uk = "3.5", us = "4.5", eu = "20"),
            Size(gender = GenderType.BABYS, uk = "4", us = "5", eu = "20"),
            Size(gender = GenderType.BABYS, uk = "4.5", us = "5.5", eu = "21"),
            Size(gender = GenderType.BABYS, uk = "5", us = "6", eu = "22"),
            Size(gender = GenderType.BABYS, uk = "5.5", us = "6.5", eu = "22"),
            Size(gender = GenderType.BABYS, uk = "6", us = "7", eu = "23"),
            Size(gender = GenderType.BABYS, uk = "6.5", us = "7.5", eu = "23"),
            Size(gender = GenderType.BABYS, uk = "7", us = "8", eu = "24"),
            Size(gender = GenderType.BABYS, uk = "7.5", us = "8.5", eu = "25"),
            Size(gender = GenderType.BABYS, uk = "8", us = "9", eu = "25"),
            Size(gender = GenderType.BABYS, uk = "8.5", us = "9.5", eu = "26"),
            Size(gender = GenderType.BABYS, uk = "9", us = "10", eu = "27"),

            Size(gender = GenderType.KIDS, uk = "9.5", us = "10.5", eu = "27"),
            Size(gender = GenderType.KIDS, uk = "10", us = "11", eu = "28"),
            Size(gender = GenderType.KIDS, uk = "10.5", us = "11.5", eu = "29"),
            Size(gender = GenderType.KIDS, uk = "11", us = "12", eu = "30"),
            Size(gender = GenderType.KIDS, uk = "11.5", us = "12.5", eu = "30"),
            Size(gender = GenderType.KIDS, uk = "12", us = "13", eu = "31"),
            Size(gender = GenderType.KIDS, uk = "12.5", us = "13.5", eu = "31"),
            Size(gender = GenderType.KIDS, uk = "13", us = "1", eu = "32"),
            Size(gender = GenderType.KIDS, uk = "14", us = "1.5", eu = "33"),
            Size(gender = GenderType.KIDS, uk = "1", us = "2", eu = "33"),
            Size(gender = GenderType.KIDS, uk = "1.5", us = "2.5", eu = "34"),
            Size(gender = GenderType.KIDS, uk = "2", us = "3", eu = "34"),

            Size(gender = GenderType.WOMENS, uk = "2", us = "4", eu = "35"),
            Size(gender = GenderType.WOMENS, uk = "2.5", us = "4.5", eu = "35"),
            Size(gender = GenderType.WOMENS, uk = "3", us = "5", eu = "35-36"),
            Size(gender = GenderType.WOMENS, uk = "3.5", us = "5.5", eu = "36"),
            Size(gender = GenderType.WOMENS, uk = "4", us = "6", eu = "36-37" ),
            Size(gender = GenderType.WOMENS, uk = "4.5", us = "6.5", eu = "37"),
            Size(gender = GenderType.WOMENS, uk = "5", us = "7", eu = "37-38"),
            Size(gender = GenderType.WOMENS, uk = "5.5", us = "7.5", eu = "38"),
            Size(gender = GenderType.WOMENS, uk = "6", us = "8", eu = "38-39"),
            Size(gender = GenderType.WOMENS, uk = "6.5", us = "8.5", eu = "39"),
            Size(gender = GenderType.WOMENS, uk = "7", us = "9", eu = "39-40"),
            Size(gender = GenderType.WOMENS, uk = "7.5", us = "9.5", eu = "40"),
            Size(gender = GenderType.WOMENS, uk = "8", us = "10", eu = "40-41"),
            Size(gender = GenderType.WOMENS, uk = "8.5", us = "10.5", eu = "41"),
            Size(gender = GenderType.WOMENS, uk = "9", us = "11", eu = "41-42"),
            Size(gender = GenderType.WOMENS, uk = "9.5", us = "11.5", eu = "42"),
            Size(gender = GenderType.WOMENS, uk = "10", us = "12", eu = "42-43"),

            Size(gender = GenderType.MENS, uk = "5.5", us = "6", eu = "39"),
            Size(gender = GenderType.MENS, uk = "6", us = "6.5", eu = "39"),
            Size(gender = GenderType.MENS, uk = "6.5", us = "7", eu = "40"),
            Size(gender = GenderType.MENS, uk = "7", us = "7.5", eu = "40-41"),
            Size(gender = GenderType.MENS, uk = "7.5", us = "8", eu = "41"),
            Size(gender = GenderType.MENS, uk = "8", us = "8.5", eu = "41-42"),
            Size(gender = GenderType.MENS, uk = "8.5", us = "9", eu = "42"),
            Size(gender = GenderType.MENS, uk = "9", us = "9.5", eu = "42-43"),
            Size(gender = GenderType.MENS, uk = "9.5", us = "10", eu = "43"),
            Size(gender = GenderType.MENS, uk = "10", us = "10.5", eu = "43-44"),
            Size(gender = GenderType.MENS, uk = "10.5", us = "11", eu = "44"),
            Size(gender = GenderType.MENS, uk = "11", us = "11.5", eu = "44-45"),
            Size(gender = GenderType.MENS, uk = "11.5", us = "12", eu = "45"),
            Size(gender = GenderType.MENS, uk = "12.5", us = "13", eu = "46"),
            Size(gender = GenderType.MENS, uk = "13.5", us = "14", eu = "47"),
            Size(gender = GenderType.MENS, uk = "14.5", us = "15", eu = "48"),
            Size(gender = GenderType.MENS, uk = "15.5", us = "16", eu = "49"),

            )
    }
}