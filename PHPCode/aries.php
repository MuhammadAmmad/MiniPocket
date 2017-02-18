<?php
require"init.php";

$data = [];
$sql = "SELECT * FROM Horoscope where Id='aries'";
$result = $con->query($sql);

if ($result->num_rows >0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
       $data[] = $row;
    }

}
$con->close();
header('Content-Type: application/json');
echo json_encode($data);
?>