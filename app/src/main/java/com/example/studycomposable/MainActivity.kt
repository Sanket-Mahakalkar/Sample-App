package com.example.studycomposable

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.kredivocorp.kredivo.subsystem.ui.KredivoPrimaryButton
import com.kredivocorp.kredivo.timo_sdk_core.TimoMainActivity
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KredivoPrimaryButton(
                onClick = { TimoMainActivity.launch(this) }
            ) {
                Text("Click to launch SDK")
            }
//            TimoMainActivity.launch(this)
//            TestComposable()
////            WebView()
////            WebViewDUmmy()
////            ListViewInCompose()
////            CreateEditTextAndSnackBar()
////            UiState()
//            ImageCard(painterResource(id = R.drawable.my_image),
//                "This is my Image",
//                "This is my fav click")
////            Greeting1()
////            Greeting2()
        }
    }
}

@Composable
fun ModifierTest() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Yellow)
            .padding(40.dp)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(5.dp)
            .border(5.dp, Color.Green)
            .padding(5.dp)

    ) {
        Text(
            "Sanket", modifier = Modifier
                .padding(bottom = 20.dp)
                .background(Color.LightGray)

        )
        Text("Mahakalkar")
    }
}

@Composable
fun PreviewCheck(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "title", style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 20.sp,
                color = Color.Blue,
            )
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp),

        ) {
            Text(
                text = "value",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 20.sp,
                    color = Color.Red
                )
            )
//            Icon(
////                imageVector = Icons.Outlined.Info,
//                tint = Color.Gray,
//                contentDescription = null,
//            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        CustomerServiceComponent(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 0.dp, 0.dp)

        )
    }
}

@Composable
fun CustomerServiceComponent(
    onContactCustomerServiceClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(4.dp)
            )
            .clickable {
//                    onContactCustomerServiceClick()
            }
            .padding(12.dp)

           
    ) {
//        Image(
//            painter = painterResource(R.drawable.my_image),
//            contentDescription = null,
//            modifier = Modifier.size(24.dp)
//        )

        Column(
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(
                text = "kdvph_bs_disbursal_status_cs_header_dt",
                style = MaterialTheme.typography.titleSmall,
                color = Color.White
            )

            Text(
                text = "kdvph_bs_disbursal_status_cs_desc_dt",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray,
                modifier = Modifier.padding(top = 4.dp)
            )
        }

        Spacer(modifier = Modifier
            .width(8.dp)
            .weight(1f))

//        Icon(
//            modifier = Modifier.size(20.dp),
//            imageVector = Icons.Filled.KeyboardArrowRight,
//            tint = Color.Blue,
//            contentDescription = null,
//        )
    }
}

@Composable
fun WarningBox(
    modifier: Modifier = Modifier,
){
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(Color.Yellow)
            .padding(12.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
//        Icon(
//            painter = rememberVectorPainter(Icons.Rounded.Warning),
//            contentDescription = null,
//            tint = Color(0xFFF59E0B),
//            modifier = Modifier.size(15.dp).align(Alignment.Top)
//        )

       Text("ncxka xkn cbcljnc cknbclac colqcnq kcnqjdc caasd cqndcjlqcq cqkcnqc ckqcnlqcnc q")

    }
}

@Composable
fun KredivoFooter() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "[Placeholder] By",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.width(4.dp))
//            Image(
////                painter = painterResource(id = R.drawable.my_image), // Update with actual logo file
//                contentDescription = "Kredivo Logo", modifier = Modifier.height(40.dp)
//            )
        }


        // Kredivo Logo + Tagline (image assumed)

        Spacer(modifier = Modifier.height(8.dp))

        // Footer Text
        Text(
            text = "PT. Kredivo Finance Indonesia berizin dan diawasi oleh OJK fafjh cah",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun WebViewDUmmy() {
    var showAgreeButton by remember { mutableStateOf(false) }

    Scaffold { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // WebView (handles its own scroll)
            AndroidView(
                factory = { context ->
                    WebView(context).apply {
                        settings.javaScriptEnabled = true
                        loadUrl("https://kredivo.com.ph/privacy/")

                        viewTreeObserver.addOnScrollChangedListener {
                            val contentHeightInPx = contentHeight * resources.displayMetrics.density
                            val visibleHeight = height.toFloat()
                            val scrolledY = scrollY.toFloat()
                            val threshold = 20f

                            if ((scrolledY + visibleHeight) >= (contentHeightInPx - threshold)) {
                                showAgreeButton = true
                            } else {
                                showAgreeButton = false
                            }
                        }
                    }
                },
                modifier = Modifier.fillMaxSize()
            )

            // "I Agree" Button shown only when user reaches bottom
            AnimatedVisibility(
                visible = showAgreeButton,
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Button(
                    onClick = { /* handle agreement */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text("I Agree")
                }
            }
        }
    }

}

@Composable
private fun WebView() {

    var webViewHeight by remember { mutableStateOf(0) }
    var isPageLoaded by remember { mutableStateOf(false) }

    // Scrollable container
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // WebView inside AndroidView with dynamic height
        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    settings.javaScriptEnabled = true
                    // Adjust height when page is fully loaded
                    setOnScrollChangeListener { _, _, scrollY, _, _ ->
                        val contentHeight = contentHeight * context.resources.displayMetrics.density
                        val viewHeight = height.toFloat()
                        val threshold = 20f

                        isPageLoaded = scrollY + viewHeight >= contentHeight - threshold
                    }
                    webViewClient = object : WebViewClient() {
                        override fun onPageFinished(view: WebView?, url: String?) {
                            super.onPageFinished(view, url)
//                            isPageLoaded = true

//                            evaluateJavascript(
//                                "(document.body.scrollHeight || document.documentElement.scrollHeight).toString();"
//                            ) { heightStr ->
//                                heightStr?.toFloatOrNull()?.let {
//                                    val density = resources.displayMetrics.density
//                                    webViewHeight = (it * density).toInt()
//                                }
//                            }
                        }
                    }
                    loadUrl("https://kredivo.com.ph/privacy/")
                }
            },
            modifier = Modifier
                .fillMaxWidth()

//                .height(with(LocalDensity.current) { webViewHeight.toDp() })
        )
        if (isPageLoaded) {
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            // Native Compose Button at bottom

            Button(
                onClick = { /* Handle agreement */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("I Agree")
            }
        }

    }
}


@Composable
private fun TestComposable() {
    val showBottom = remember { mutableStateOf(false) }
    val webView = remember { mutableStateOf<WebView?>(null) }
    Box(modifier = Modifier.fillMaxSize()) {

        // WebView equivalent (takes all available space)
        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    webView.value = this
                    settings.apply {
                        javaScriptEnabled = true
                        domStorageEnabled = true
                        // Disable caching
                        cacheMode = WebSettings.LOAD_NO_CACHE
                    }
                    // Listen for scroll changes
                    setOnScrollChangeListener { _, _, scrollY, _, _ ->
                        val contentHeight = contentHeight * context.resources.displayMetrics.density
                        val viewHeight = height.toFloat()
                        val threshold = 20f

                        showBottom.value = scrollY + viewHeight >= contentHeight - threshold
                    }
                    webViewClient = object : WebViewClient() {
                        override fun shouldOverrideUrlLoading(
                            view: WebView?, request: WebResourceRequest?
                        ): Boolean {
                            return false
                        }

                        override fun onPageFinished(view: WebView?, url: String?) {
                            evaluateJavascript(
                                """
                            (function() {
                                document.body.style.marginBottom = '100px';
                            })();
                            """.trimIndent(), null
                            )
//                            view?.viewTreeObserver?.addOnScrollChangedListener {
//                                val scrollY = view.scrollY
//                                val contentHeight =
//                                    view.contentHeight * context.resources.displayMetrics.density
//                                val viewHeight = view.height.toFloat()
//                                val threshold = 20f
//
//                                showBottom.value = scrollY + viewHeight >= contentHeight - threshold
//                            }
                        }
                    }
                    loadUrl("https://kredivo.com.ph/privacy/")
                }
            },
        )

        // Button at the bottom
        if (showBottom.value) {
            Button(
                onClick = { /* handle click */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            ) {
                Text("Continue")
            }
        } else {
            // Overlay background behind the button
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.White.copy(alpha = 0.9f)
                            )
                        )
                    )
            )

//            FloatingActionButton(
//                onClick = {
//                    webView.value?.evaluateJavascript(
//                        "window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });",
//                        null
//                    )
//                },
//                modifier = Modifier
//                    .align(Alignment.BottomCenter)
//                    .padding(bottom = 30.dp)
//            ) {
//
//                Icon(Icons.Default.ArrowDropDown, contentDescription = "Scroll to Bottom")
//            }
        }
    }
}

@Composable
fun ListViewInCompose() {
    LazyColumn {
        items(5000) {
            Text(
                text = "Item $it",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CreateEditTextAndSnackBar() {
    var textFieldState by remember {
        mutableStateOf("")
    }
    val snackbarHostState = remember {
        SnackbarHostState()
    }
    val scope = rememberCoroutineScope()
    Scaffold(
        Modifier.fillMaxSize(), snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(Modifier.fillMaxWidth()) {
                TextField(
                    value = textFieldState, onValueChange = { it1 ->
                        textFieldState = it1
                    }, label = {
                        Text("Enter your name")
                    }, singleLine = true, modifier = Modifier.fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                scope.launch { snackbarHostState.showSnackbar("Hello $textFieldState") }
            }) {
                Text(text = "Please Greet him")
            }
        }
    }
}

@Composable
fun UiState() {
    val color = remember {
        mutableStateOf(Color.Yellow)
    }
    val count = remember {
        mutableStateOf(1)
    }
    Column() {
        ColorBox(
            Modifier
                .weight(1f)
                .fillMaxSize(), {
                color.value = it
            }, {
                count.value = it
            })
        Box(
            Modifier
                .weight(1f)
                .fillMaxSize()
                .background(color.value)
        ) {
            Box(
                Modifier.fillMaxSize(), contentAlignment = Alignment.Center
            ) {
                Text(
                    text = count.value.toString(), fontSize = 30.sp
                )
            }
        }
    }
}


@Composable
fun ColorBox(
    modifier: Modifier = Modifier, updateColor: (Color) -> Unit, updateCount: (Int) -> Unit
) {
    Box(
        modifier
            .background(Color.Red)
            .clickable {
                updateColor(
                    Color(
                        Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f
                    )
                )
                val value = (5..15).random()
                updateCount(value)
            })
}

@Composable
fun Greeting2() {
    Column(
        modifier = Modifier
//            .width(600.dp)
//            .requiredWidth(3600.dp)
            .background(Color.Green)
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(1.dp)

    ) {
        Text(text = "Hello", Modifier.offset(0.dp, 20.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "world")
    }
}


@Composable
fun Greeting1() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth(0.5f)
            .height(300.dp)
    ) {
        Text(text = "Hello")
        Text(text = "sanket")

    }
}


@Composable
fun ImageCard(
    painter: Painter, contentDescription: String, title: String, modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .width(250.dp)
            .height(350.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Box {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.Transparent, Color.Black), startY = 450f
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = buildAnnotatedString {
                        append()
                    },
                    style = TextStyle(color = Color.White, fontSize = 16.sp),
                    fontFamily = FontFamily.Monospace

                )
            }
        }


    }
}