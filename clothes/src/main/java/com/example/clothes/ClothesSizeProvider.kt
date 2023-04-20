package com.example.clothes

import com.example.common.DataProvider
import com.example.common.GenderType
import com.example.common.Size

object ClothesSizeProvider: DataProvider {
    override fun provide(): List<Size>{
        return listOf(
            Size(gender = GenderType.BABYS, uk = "0-3m", us = "0-3m", eu = "56-62"),
            Size(gender = GenderType.BABYS, uk = "6m", us = "3-6m", eu = "62-68"),
            Size(gender = GenderType.BABYS, uk = "9m", us = "6-9m", eu = "63-74"),
            Size(gender = GenderType.BABYS, uk = "12m", us = "9-12m", eu = "74-80"),
            Size(gender = GenderType.BABYS, uk = "12m", us = "12-18m", eu = "80-86"),
            Size(gender = GenderType.BABYS, uk = "18-24m", us = "18-24m", eu = "86-92"),
            Size(gender = GenderType.BABYS, uk = "2-3", us = "2T", eu = "92-98"),
            Size(gender = GenderType.BABYS, uk = "3-4", us = "3T-4T", eu = "98-104"),

            Size(gender = GenderType.KIDS, uk = "4-5", us = "5", eu = "104-110"),
            Size(gender = GenderType.KIDS, uk = "5-6", us = "6", eu = "110-116"),
            Size(gender = GenderType.KIDS, uk = "6-7", us = "6-7", eu = "116-122"),
            Size(gender = GenderType.KIDS, uk = "7-8", us = "7-8", eu = "122-128"),
            Size(gender = GenderType.KIDS, uk = "8-9", us = "9-10", eu = "128-134"),
            Size(gender = GenderType.KIDS, uk = "9-10", us = "10", eu = "134-140"),
            Size(gender = GenderType.KIDS, uk = "10-11", us = "11", eu = "140-146"),
            Size(gender = GenderType.KIDS, uk = "11-12", us = "12", eu = "146-152"),

            Size(gender = GenderType.WOMENS, uk = "4", us = "1", eu = "32"),
            Size(gender = GenderType.WOMENS, uk = "6", us = "2", eu = "34"),
            Size(gender = GenderType.WOMENS, uk = "8", us = "4", eu = "36"),
            Size(gender = GenderType.WOMENS, uk = "10", us = "6", eu = "38"),
            Size(gender = GenderType.WOMENS, uk = "12", us = "8", eu = "40"),
            Size(gender = GenderType.WOMENS, uk = "14", us = "10", eu = "42"),
            Size(gender = GenderType.WOMENS, uk = "16", us = "12", eu = "44"),
            Size(gender = GenderType.WOMENS, uk = "18", us = "14", eu = "46"),
            Size(gender = GenderType.WOMENS, uk = "20", us = "16", eu = "48"),
            Size(gender = GenderType.WOMENS, uk = "22", us = "18", eu = "50"),
            Size(gender = GenderType.WOMENS, uk = "24", us = "20", eu = "52"),
            Size(gender = GenderType.WOMENS, uk = "26", us = "22", eu = "54"),

            Size(gender = GenderType.MENS, uk = "30", us = "30", eu = "40"),
            Size(gender = GenderType.MENS, uk = "32", us = "32", eu = "42"),
            Size(gender = GenderType.MENS, uk = "34", us = "34", eu = "44"),
            Size(gender = GenderType.MENS, uk = "36", us = "36", eu = "46"),
            Size(gender = GenderType.MENS, uk = "38", us = "38", eu = "48"),
            Size(gender = GenderType.MENS, uk = "40", us = "40", eu = "40"),
            Size(gender = GenderType.MENS, uk = "42", us = "42", eu = "52"),
            Size(gender = GenderType.MENS, uk = "44", us = "44", eu = "54"),
            Size(gender = GenderType.MENS, uk = "46", us = "46", eu = "56"),
            Size(gender = GenderType.MENS, uk = "48", us = "48", eu = "58"),
            Size(gender = GenderType.MENS, uk = "50", us = "50", eu = "60"),
            )
    }
}