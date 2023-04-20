package com.example.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun ConvertorScreen(
    viewModel: ConvertorViewModel,
    resources: Resources
) {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
    ) {

        val (icon, title, gender, insert, result, convert) = createRefs()


        IconImage(
            resources.icon,
            Modifier.constrainAs(icon) {
                linkTo(start = parent.start, end = parent.end)
                top.linkTo(parent.top, 10.dp)
            }
        )

        Title(stringResource(id = resources.title).uppercase(),
            Modifier.constrainAs(title) {
                linkTo(start = parent.start, end = parent.end)
                top.linkTo(icon.bottom, 5.dp)
            }
        )

        DropdownMenuBox(
            list = viewModel.genderTypes,
            modifier = Modifier.constrainAs(gender) {
                linkTo(start = parent.start, end = parent.end)
                top.linkTo(title.bottom, 5.dp)
            },
            text = viewModel.gender,
            onSelect = { viewModel.handleEvent(SizeEvent.SetGender(it)) }
        )

        Row(
            modifier = Modifier
                .constrainAs(insert) {
                    linkTo(start = parent.start, end = parent.end)
                    top.linkTo(gender.bottom, 5.dp)
                },
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            DropdownMenuBox(
                list = viewModel.sizeTypes,
                modifier = Modifier,
                text = viewModel.from,
                onSelect = { viewModel.handleEvent(SizeEvent.SetFrom(it)) }
            )
            DropdownMenuBox(
                list = viewModel.sizeTypes,
                modifier = Modifier,
                text = viewModel.to,
                onSelect = { viewModel.handleEvent(SizeEvent.SetTo(it)) }
            )
        }

        Row(
            modifier = Modifier
                .constrainAs(result) {
                    linkTo(start = parent.start, end = parent.end)
                    top.linkTo(insert.bottom, 5.dp)
                },
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            DropdownMenuBox(
                list = viewModel.sizes.value,
                modifier = Modifier,
                text = viewModel.size,
                onSelect = { viewModel.handleEvent(SizeEvent.SetSize(it)) },
                onExpandedChange = { viewModel.handleEvent(SizeEvent.SetSizeList) }
            )
            Result(viewModel.result, Modifier)
        }

        Button(
            modifier = Modifier
                .constrainAs(convert) {
                    linkTo(start = parent.start, end = parent.end)
                    top.linkTo(result.bottom, 10.dp)
                },
            onClick = {
                viewModel.handleEvent(SizeEvent.Convert)
            }
        ) {
            Text(text = stringResource(id = R.string.convert))
        }

    }
}

@Composable
fun IconImage(id: Int, modifier: Modifier) {
    Image(
        modifier = modifier
            .size(80.dp, 80.dp),
        painter = painterResource(id = id),
        contentDescription = ""
    )
}


@Composable
fun Title(title: String, modifier: Modifier) {
    Text(
        modifier = modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = title,
        style = MaterialTheme.typography.h4
    )
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DropdownMenuBox(
    list: List<String>,
    modifier: Modifier,
    text: MutableState<String>,
    onSelect: (select: String) -> Unit,
    onExpandedChange: () -> Unit = {}
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(text.value) }

    Box(
        modifier = modifier.padding(10.dp).background(MaterialTheme.colors.primary)
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                onExpandedChange()
                expanded = !expanded
            }
        ) {
            TextField(
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
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
                            onSelect(selectedText)
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
        modifier = modifier
            .width(160.dp)
            .padding(10.dp),
        textAlign = TextAlign.Center,
        text = result.value,
        style = MaterialTheme.typography.h6
    )
}






