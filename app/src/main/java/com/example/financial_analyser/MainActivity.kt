package com.example.financial_analyser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinancialDataApp()
        }
    }
}

@Composable
fun FinancialDataApp() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // Sample data for testing
            val financialData = listOf("Stock A: $100", "Stock B: $150", "Market Update: Bullish")
            FinancialDataList(financialData)
        }
    }
}

@Composable
fun FinancialDataList(dataList: List<String>) {
    LazyColumn {
        items(dataList) { data ->
            FinancialDataItem(data)
        }
    }
}

@Composable
fun FinancialDataItem(data: String) {
    Text(
        text = data,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun FinancialDataItemPreview() {
    FinancialDataItem(data = "Sample Data: Stock A - $100")
}

@Preview(showBackground = true)
@Composable
fun FinancialDataListPreview() {
    FinancialDataApp()
}
