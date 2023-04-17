package com.example.common

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun ConvertorScreen(
    viewModel: ConvertorViewModel
) {

    ConstraintLayout(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {

        val (icon, title, gender, insert, result) = createRefs()


        IconImage(0, Modifier)

        Title(AppParent.appId, Modifier)

        DropdownMenuBox(viewModel.genderTypes, Modifier)

        Row {
            DropdownMenuBox(viewModel.sizeTypes, Modifier)
            DropdownMenuBox(viewModel.sizeTypes, Modifier)
        }

        Row {
            DropdownMenuBox(viewModel.sizeTypes, Modifier)
            Result(viewModel.result, Modifier)

        }

    }
}

@Composable
fun IconImage(id: Int, modifier: Modifier) {
    Image(
        modifier = Modifier
            .size(150.dp, 150.dp),
        painter = painterResource(id = id),
        contentDescription = ""
    )
}


@Composable
fun Title(title: String?, modifier: Modifier) {
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = title ?: "NULL",
        style = MaterialTheme.typography.h4
    )
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DropdownMenuBox(list: List<String>, modifier: Modifier) {
    val context = LocalContext.current
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf("Select Your Gender") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ) {
            TextField(
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                list.forEach { item ->
                    DropdownMenuItem(
                        onClick = {
                            selectedText = item
                            expanded = false
                            Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                        }
                    ) {
                        Text(text = item)
                    }
                }
            }
        }
    }
}

@Composable
fun Result(result: MutableState<String>, modifier: Modifier) {
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = result.value,
        style = MaterialTheme.typography.h4
    )
}






