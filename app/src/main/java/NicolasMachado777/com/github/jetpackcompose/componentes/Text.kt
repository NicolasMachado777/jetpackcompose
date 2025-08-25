package NicolasMachado777.com.github.jetpackcompose.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import NicolasMachado777.com.github.jetpackcompose.R
import androidx.compose.ui.text.font.FontStyle

val fontFamilyPlaywrite = FontFamily(
    Font(R.font.playwriteca, FontWeight.Normal),
)

val fontFamilyMerriweather = FontFamily(
    Font(R.font.merriweather, FontWeight.Normal),
)

@Composable
fun SimpleText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.hello_turma),
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = fontFamilyPlaywrite
        )
    }
}

@Composable
fun TextShadow() {
    val offset = Offset(x = 5f, y = 10f)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Text(
            text = stringResource(id = R.string.hello_turma),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 24.sp,
                shadow = Shadow(color = Color.Blue, offset = offset, blurRadius = 5f),
                fontFamily = fontFamilyMerriweather
            ),
        )
    }
}

@Composable
fun DifferentFont() {
    Column {
        Text(
            text = "Texto com Playwrite Regular",
            fontFamily = fontFamilyPlaywrite,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
        )


        Text(
            text = "Texto com Merriweather Regular",
            fontFamily = fontFamilyMerriweather,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
        )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = "Texto com Playwrite - A fonte moderna.",
            fontFamily = fontFamilyPlaywrite,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )


        Text(
            text = "Texto com Merriweather - A fonte clássica.",
            fontFamily = fontFamilyMerriweather,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = "Texto em Merriweather Bold",
            fontFamily = fontFamilyMerriweather,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
        )


        Text(
            text = "Texto em Playwrite Bold",
            fontFamily = fontFamilyPlaywrite,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
        )
    }
}

@Preview
@Composable
fun Preview() {

    DifferentFont()
}
