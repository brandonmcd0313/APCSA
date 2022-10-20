using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class cameraController : MonoBehaviour
{

    public float reset, increment;
    public float speed = 2f;
    public GameObject background;
    // Use this for initialization
    void Start()
    {
        increment = reset;
    }

    // Update is called once per frame
    void Update()
    {
        transform.position += new Vector3(
            speed * Time.deltaTime, 0);

        if (transform.position.x >= reset)
        {
            background.transform.position +=
                new Vector3(increment, 0);
            reset += increment;

        }
    }
}
